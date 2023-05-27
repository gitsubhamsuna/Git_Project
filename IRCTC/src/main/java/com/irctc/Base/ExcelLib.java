package com.irctc.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelLib {
	@Test
	public void read() {
		FileInputStream file = null;
		XSSFWorkbook workbook = null;
		XSSFRow row = null;
		XSSFCell cell = null;
		
					try {
						File f=new File("C:\\Users\\USER\\eclipse-workspace\\IRCTC\\ExcelData\\TestExcelData.xlsx");
						file = new FileInputStream(f);
						workbook = new XSSFWorkbook(file);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
						
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rownum=sheet.getLastRowNum();
		int cellnum=row.getLastCellNum();
		
		for(int i=0;i<=rownum;i++) {
			row=sheet.getRow(rownum);
			String data=row.getCell(cellnum).getStringCellValue();
			
			System.out.println(data);
		}
		
	}
	
}
