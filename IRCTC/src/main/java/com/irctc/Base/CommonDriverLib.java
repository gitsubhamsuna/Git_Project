package com.irctc.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonDriverLib {
	
	public WebDriver driver;
	public void waitForPageLoad(int time) {
		BrowserDriverLib.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void waitForXpath(String xpath) {
		WebDriverWait wait=new WebDriverWait(BrowserDriverLib.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

}
