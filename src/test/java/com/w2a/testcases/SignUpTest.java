package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import cross.pages.HomePage;
import cross.pages.SignInPage;
import cross.utilities.Utilities;


public class SignUpTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void signupTest(Hashtable<String,String> data){
		
		HomePage home = new HomePage();
		home.clickSignIn();
		SignInPage sn=new SignInPage();
		sn.gotoSignInPage(data.get("email"));
		
				
		
	
		
	}

}
