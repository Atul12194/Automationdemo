package cross.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import cross.base.TestBase;

public class SelectProductPage extends TestBase
{

	@Test
	public void selectProduct() throws InterruptedException
	{
		log.debug("inside the select product page and select women and click on quick view");
		click("womenclick_XPATH");
		click("quickview_XPATH");
		Thread.sleep(3000);
	    driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
        click("plusicon_XPATH");
        click("addtocartbtn_XPATH");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed to checkout')]")));        
        click("proctocheckoutbtn_XPATH");
        click("summrcheckbtn_XPATH");
        click("addcheckbtn_XPATH");
        click("termsbtn_XPATH");
        click("processcheckcarr_XPATH");
        
        WebElement totalprice=driver.findElement(By.id("total_price"));
        System.out.println(totalprice.getText());
        
        String actual=totalprice.getText();
        String expected="$35.02";
       Assert.assertEquals(actual, expected);
        
        
        click("clickbank_XPATH");
        click("confirmbtn_XPATH");


         log.debug("Successfully added 2 product and successfully placed oredr");
         log.debug("Now verifing order history ");
	     click("myprofile_XPATH");
         click("myorderhistory_XPATH");
        log.debug("SUCESSFULLY DISPLAYED ORDER HISTORY ");
		
	}
	
}
