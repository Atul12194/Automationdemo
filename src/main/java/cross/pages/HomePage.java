package cross.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cross.base.TestBase;


public class HomePage extends TestBase {
	
	

	
	public CreateAccountPage clickSignIn()
	{
		log.debug("clicking on signup button");
		click("clicksignIn_XPATH");
		return new CreateAccountPage();

	}
	
	
	
}
