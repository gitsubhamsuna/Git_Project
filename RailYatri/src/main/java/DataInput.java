import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataInput {
	
	@Test
	public void excelData() throws Exception 
	 {
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\RailYatri\\ExcelFile\\Excel_Data.xlsx");
		
			FileInputStream file = new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		String data=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
	}

}
