package cross.pages;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import cross.base.TestBase;
import cross.utilities.Utilities;

public class CreateAccountPage extends TestBase
{
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public LoginPage createAccount(String fname,String lname,String password,String company,String address,
	String address2,String city,String postalcode,String addinfo,String homephone,String mobphone,String alise)

	{
	   log.debug("inside the create account test and entering all details");
		click("title_XPATH");
		type("firstName_XPATH",fname);
		type("lastName_XPATH", lname);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		type("password_XPATH", password);

		Select day= new Select(driver.findElement(By.id("days")));
		day.selectByIndex(12);
		
		Select month= new Select(driver.findElement(By.id("months")));
		month.selectByIndex(1);
		
		Select year= new Select(driver.findElement(By.id("years")));
		year.selectByIndex(27);

		
		
		
		click("newlet_XPATH");
		click("option_XPATH");
		type("company_XPATH",company);
		type("address1_XPATH",address);
		type("address2_XPATH",address2);
		type("city_XPATH",city);


		
		Select dropdown = new Select(driver.findElement(By.id("id_state")));
		dropdown.selectByVisibleText("Alaska");
		
		type("postalcode_XPATH", postalcode);
	
		Select coutry= new Select(driver.findElement(By.id("id_country")));
		coutry.selectByIndex(1);
		
		type("addinfo_XPATH", addinfo);
		type("homephone_XPATH",homephone);

		type("mobile_XPATH",mobphone);

		type("futureadd_XPATH",alise);

        click("register_XPATH");
        log.debug("successfully entered all details nd now navigating to login page");
	
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
 

        return new LoginPage();
		
	}

}
