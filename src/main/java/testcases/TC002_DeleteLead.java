package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class TC002_DeleteLead extends ProjectSpecificMethods{
	
	@Test
	public void runCreateLead() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElement(By.linkText("Delete")).click();
		
	}
	
}
