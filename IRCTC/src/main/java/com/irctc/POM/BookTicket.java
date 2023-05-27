package com.irctc.POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookTicket extends LoginPage {
	
	public BookTicket(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")
	private WebElement fromJourny;
	
	@FindBy(xpath="//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")
	private WebElement toJourny;
	
	@FindBy(xpath="//ul[@id='pr_id_1_list']//li[@id='p-highlighted-option']")
	private WebElement addressSelect1;
	
	@FindBy(xpath="//ul[@id='pr_id_2_list']//li[@id='p-highlighted-option']")
	private WebElement addressSelect2;
	
	@FindBy(xpath="//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")
	private WebElement ticketCatagory;
	
	@FindBy(xpath="//ul[@class='ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c65-12']")
	private WebElement dropdown;
	
	@FindBy(xpath="//span[@class='ng-star-inserted'][text()='GENERAL']")
	private WebElement generalTicket;
	
	@FindBy(xpath="//span[@class='ng-star-inserted'][text()='TATKAL']")
	private WebElement tatkalTicket;
	
	@FindBy(xpath="//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	private WebElement date;
	
	@FindBy(xpath="//button[@class='search_btn train_Search']")
	private WebElement searchButton;
	
	public void journy(String startJ, String endJ,String catagory, String dateJ) {
		fromJourny.sendKeys(startJ);
		addressSelect1.click();
		toJourny.sendKeys(endJ);
		addressSelect2.click();
		waitForPageLoad(20);
		catagoryTicket(catagory);
		waitForPageLoad(10);
//		dateJourny(dateJ);
//		searchButton.click();
		
	}
	private String catagoryTicket(String catagory) {
		ticketCatagory.click();
		waitForPageLoad(20);
		if(catagory.equalsIgnoreCase("GENERAL")) {
			generalTicket.click();
		}
		else if(catagory.equalsIgnoreCase("TATKAL")) {
				tatkalTicket.click();
		}
		else {
			System.out.println("Not Valid Catagory");
		}
		return catagory;
	}
	private String dateJourny(String datee) {
		date.clear();
		Actions act=new Actions(driver);
		act.keyDown(date,Keys.CONTROL).sendKeys("a").sendKeys(datee,Keys.ENTER).perform();	
		return datee;
		
	}

}
