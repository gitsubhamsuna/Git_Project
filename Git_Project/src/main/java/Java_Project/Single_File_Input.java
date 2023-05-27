package Java_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Single_File_Input {
	public FileInputStream file;
	public XSSFWorkbook workbook;
	@Test
	public void fileInput() {
		try {
			 file=new FileInputStream("C:\\Users\\USER\\Desktop\\VSCode\\ExcelData.xlsx");
			 workbook=new XSSFWorkbook(file);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		XSSFSheet sheet=workbook.getSheetAt(0);
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}

}
