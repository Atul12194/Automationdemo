package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import cross.pages.CreateAccountPage;
import cross.utilities.Utilities;


public class CreateAccountTest {
	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data)
	{
		
		CreateAccountPage cp=new CreateAccountPage();
		cp.createAccount(data.get("fname"),data.get("lname"),data.get("password"),data.get("company"),data.get("address"),data.get("address2"),data.get("city"),
				data.get("postalcode"),data.get("addinfo"),data.get("homephone"),data.get("mobphone"),data.get("alise"));
		
		
	}

}
