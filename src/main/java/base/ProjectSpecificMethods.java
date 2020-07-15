package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods {
//	comment
	public String excelFileName;
	public ChromeDriver driver;
	
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void startApp(String url, String uName, String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		
		return ReadExcel.readExcel(excelFileName);
		
		/*
		 * String[][] data = new String[2][3];
		 * 
		 * data[0][0] = "TestLeaf"; // Hardcoding the data data[0][1] = "Sam";
		 * data[0][2] = "Lazarus";
		 * 
		 * data[1][0] = "TestLeaf"; data[1][1] = "Naveen"; data[1][2] = "Elumalai";
		 * 
		 * return data;
		 */
		
	}
	
}
