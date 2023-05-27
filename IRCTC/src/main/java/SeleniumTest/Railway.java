package SeleniumTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Railway {
	
	@Test(priority = 0)
	public void test1() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[@href='https://hotel.irctctourism.com/hotels']"));
		act.click(element).perform();
		String parentWindow=driver.getWindowHandle();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		
		while(it.hasNext()) {
			String childWindow=it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
//		driver.findElement(By.xpath("//a[@href='https://www.air.irctc.co.in/']")).click();
		driver.switchTo().window(parentWindow);
		driver.getTitle();
//		driver.getWindowHandle();
		driver.quit();
		
		
		
		
	}
	@Test(priority = 1)
	public void test2() {
		System.out.println("Test2");
		List<String> str=new ArrayList<String>();
	}
	
	
//	public void testRailway() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
//		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		driver.findElement(By.name("firstname")).sendKeys("Subham");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
//		driver.findElement(By.name("lastname")).sendKeys("Suna");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname")));
//		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
//		driver.findElement(By.xpath("//input[@id='exp-2']")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='exp-2']")));
//		driver.findElement(By.id("datepicker")).sendKeys("26-06-1993");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepicker")));
//		driver.findElement(By.id("profession-0")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("profession-0")));
//		driver.findElement(By.id("profession-1")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("profession-1")));
//		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tool-2']")));
//		WebElement continent=driver.findElement(By.id("continents"));
//		Select sel=new Select(continent);
//		sel.selectByVisibleText("Australia");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("continents")));
//		WebElement commands=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
//		Select sel1=new Select(commands);
//		List<WebElement> sele=sel1.getAllSelectedOptions();
//		WebElement uplo=driver.findElement(By.xpath("//input[@class='input-file'][@id='photo']"));
////		Actions act=new Actions(driver);
//		uplo.sendKeys("C:\\Users\\USER\\Desktop\\Screenshot 2023-04-04 172344.png");
//		
//	}
}
