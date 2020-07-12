package com.w2a.testcases;

import org.testng.annotations.AfterSuite;

import cross.base.TestBase;


public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		//TestBase.quit();
		
	}

}
