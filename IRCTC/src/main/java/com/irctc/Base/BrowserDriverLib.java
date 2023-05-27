package com.irctc.Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriverLib {
	public static WebDriver driver;

	public static WebDriver getBrowser(String app,String link) {
		if(app.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			
		}
		else if(app.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		CommonDriverLib co=PageFactory.initElements(driver, CommonDriverLib.class);
		co.waitForPageLoad(40);
		driver.get(link);
		return driver;
		
	}
	public void failScreenshot(String failMethod) {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("C:\\Users\\USER\\eclipse-workspace\\IRCTC\\FailScreenshot\\" + failMethod+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
