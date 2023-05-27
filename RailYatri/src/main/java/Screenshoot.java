import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshoot {
	public  WebDriver driver;
	public void failScreenshoot(String fileName) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\USER\\eclipse-workspace\\RailYatri\\ScreenshotFile\\"+fileName+".jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
