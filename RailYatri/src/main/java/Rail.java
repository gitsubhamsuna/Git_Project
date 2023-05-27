import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(CustomListener.class)
public class Rail {
	public WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}
	
	@Test
	public void homePage() {
//		String actmsg="MakeMyTrip - 1 Travel Website 50% OFF on Hotels, Flights & Holiday";
//		String expmsg=driver.getTitle();
//		System.out.println(actmsg);
//		System.out.println(expmsg);	
//		SoftAssert soft=new SoftAssert();
//		soft.assertTrue(driver.getTitle().equals("MakeMyTrip - 1 Travel Website 50% OFF on Hotels, Flights & Holiday"));
		
		try {
			Assert.assertEquals(false, true);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
