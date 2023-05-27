package com.irctc.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.irctc.Base.CommonDriverLib;
import com.irctc.Base.ConstantLib;

public class LoginPage extends CommonDriverLib {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//a[text()=' LOGIN ']")
	@CacheLookup
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@placeholder='User Name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='SIGN IN']")
	private WebElement signinButton;
	
	
	public void login(String user,String pass) {
		loginButton.click();
		waitForXpath("//a[text()=' LOGIN ']");
		username.sendKeys(user);
		waitForXpath("//input[@placeholder='User Name']");
		password.sendKeys(pass);
		
		signinButton.click();
		waitForXpath("//button[text()='SIGN IN']");	
	}
	

}
