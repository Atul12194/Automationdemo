package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import cross.base.TestBase;
import cross.pages.LoginPage;
import cross.utilities.Utilities;

public class LoginTest extends TestBase
{
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")

	public void loginTest(Hashtable<String,String> data)
	{
		
		LoginPage lp=new LoginPage();
		lp.loginPage(data.get("email"), data.get("password"));

	}

}
