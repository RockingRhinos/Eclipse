package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeafTapsLogin {
	
	public ChromeDriver driver;
	
	@Given("Launch the application")
	public void launchTheApplication() {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();	 
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
	    driver.manage().window().maximize();	    
	}

	@Given("Set the timeouts")
	public void setTheTimeouts() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter the username")
	public void enterTheUsername() {
	    driver.findElementById("username").sendKeys("demosalesmanager");	    
	}

	@Given("Enter the password")
	public void enterThePassword() {
	    driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Clicking on the login button")
	public void clickingOnTheLoginButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify login")
	public void verifyLogin() {
	    System.out.println(driver.getTitle());	    
	}	
	
}
