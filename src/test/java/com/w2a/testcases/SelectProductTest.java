package com.w2a.testcases;

import org.testng.annotations.Test;

import cross.base.TestBase;
import cross.pages.SelectProductPage;

public class SelectProductTest extends TestBase
{
	@Test
	public void selectproduct() throws InterruptedException
	{
		SelectProductPage sb=new SelectProductPage();
		sb.selectProduct();
		
	}
	
	
}
