package com.irctc.UserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.irctc.Base.BrowserDriverLib;
import com.irctc.Base.CommonDriverLib;
import com.irctc.Base.ExcelLib;
import com.irctc.POM.BookTicket;
import com.irctc.POM.LoginPage;

public class BookingTest {
	@Test
	public void test() {
		WebDriver driver=BrowserDriverLib.getBrowser("chrome","");
		CommonDriverLib common=PageFactory.initElements(driver, CommonDriverLib.class);
		ExcelLib exlib=PageFactory.initElements(driver, ExcelLib.class);
		BookTicket bt=PageFactory.initElements(driver, BookTicket.class);
		
		bt.journy("SBP", "BLGR", "GENERAL","01/04/2023");
		driver.quit();
	}
}
