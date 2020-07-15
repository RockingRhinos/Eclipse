package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TC001_NewEvent {

	public static void main(String[] args) throws InterruptedException {
		
// 		Changes made here
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

//		Authentication
		driver.findElementById("username").sendKeys("bowyakarthikeyan@testleaf.com");
		driver.findElementById("password").sendKeys("Thiya2128");
		driver.findElementById("Login").click();

		Thread.sleep(20000);
		
//		Click SVG Icon
		Actions builder = new Actions(driver);
		builder.click(driver.findElementByXPath("//ul[@class='slds-global-actions']/li[4]")).perform();
	
//		Click New Event and maximize it
		builder.click(driver.findElementByXPath("(//span[text()='New Event'])[1]")).perform();
		Thread.sleep(2000);
		builder.click(driver.findElement(By.xpath("//button[@title='Maximize']"))).perform();
		
//		Enter the subject
		driver.findElementByXPath("(//input[@role='textbox'])[2]").sendKeys("Meeting", Keys.ENTER);
		
//		Click on Save
		driver.findElementByXPath("(//span[@class=' label bBody'])[4]").click();
		
			
		
		
	}

}
