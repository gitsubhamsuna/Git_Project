package Java_Project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public WebDriver driver;
	public void screen(String filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(file,new File("Location of file"+filename+".jpg format"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
