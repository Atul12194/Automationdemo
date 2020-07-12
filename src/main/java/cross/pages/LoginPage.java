package cross.pages;

import org.testng.annotations.Test;

import cross.base.TestBase;
import cross.utilities.Utilities;

public class LoginPage extends TestBase
{
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")

	public SelectProductPage loginPage(String email,String password)
	{
		log.debug("inside the login test and entered valid crediatial and clicking on signin button ");
		type("email_CSS",email);
		type("pass_CSS",password);
		click("submit_XPATH");
        log.debug("login sucessfully");
   return new SelectProductPage();

		
		
	}

}
