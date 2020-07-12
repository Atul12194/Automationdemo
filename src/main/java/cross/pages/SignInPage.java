package cross.pages;

import org.openqa.selenium.By;

import cross.base.TestBase;

public class SignInPage extends TestBase
{
	public void gotoSignInPage(String email)
	{
		
		type("email_XPATH",email);
		click("createAcc_XPATH");

		//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
		//driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		
	}

}
