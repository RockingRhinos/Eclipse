package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	
	public ChromeDriver driver;
	
	@Given("Launch the Application")
	public void launchTheApplication() {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Maximize it")
	public void maximizeIt() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts")
	public void setTheTimeouts() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter the userName as (.*)")
	public void enterTheUserName(String username) {
		driver.findElementById("username").sendKeys(username);   
	}

	@Given("Enter the Password as (.*)")
	public void enterThePassword(String password) {
		driver.findElementById("password").sendKeys(password);   
	}

	@Given("Click on the login button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click on the CRMSFA link")
	public void clickOnTheCRMSFALink() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click on the Leads link")
	public void clickOnTheLeadsLink() {
	    driver.findElementByLinkText("Leads").click();
	}

	@Given("Click on the Create Lead link")
	public void clickOnTheCreateLeadLink() {
	    driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company name as (.*)")
	public void enterTheCompanyName(String companyName) {
	    driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}

	@Given("Enter the First name as (.*)")
	public void enterTheFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@When("Enter the Last name as (.*)")
	public void enterTheLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@Then("Click on the Submit button")
	public void clickOnTheSubmitButton() {
		driver.findElement(By.className("smallSubmit")).click();   
		driver.close();
	}

}
