package com.w2a.rough;

import cross.pages.CreateAccountPage;
import cross.pages.HomePage;
import cross.pages.SignInPage;

public class LoginTest {

	public static void main(String[] args) {


		HomePage home = new HomePage();
		home.clickSignIn();
		SignInPage sp=new SignInPage();
		sp.gotoSignInPage("atul.trinyx@gmail.com");
		CreateAccountPage cp=new CreateAccountPage();
		
		
		
		
	}

}
