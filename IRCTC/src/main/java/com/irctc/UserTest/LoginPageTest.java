package com.irctc.UserTest;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.irctc.Base.BrowserDriverLib;
import com.irctc.Base.CommonDriverLib;
import com.irctc.Base.ConstantLib;
import com.irctc.Base.ExcelLib;
import com.irctc.POM.LoginPage;


public class LoginPageTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		WebDriver driver=BrowserDriverLib.getBrowser("chrome","");
		CommonDriverLib common=PageFactory.initElements(driver, CommonDriverLib.class);
		ExcelLib exlib=PageFactory.initElements(driver, ExcelLib.class);
		LoginPage log=PageFactory.initElements(driver, LoginPage.class);
		
		String username=ConstantLib.username;
		String password=ConstantLib.password;
		log.login(username,password);
		driver.quit();
	}

	

}
