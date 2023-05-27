package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.irctc.Base.BrowserDriverLib;
import com.irctc.Base.CommonDriverLib;
import com.irctc.Base.CustomListener;

@Listeners(CustomListener.class)
public class RailYatri {
	public WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		driver= BrowserDriverLib.getBrowser("chrome","https://www.makemytrip.com/");
		//CommonDriverLib wait=PageFactory.initElements(driver, CommonDriverLib.class);
	}@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	@Test
	public void railTest() {
//		SoftAssert soft=new SoftAssert();
//		soft.assertTrue(driver.getTitle().equals(" OFF on Hotels, Flights & Holiday"));
		Assert.assertEquals(false, true);
	}

}
