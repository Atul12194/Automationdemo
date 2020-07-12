package com.w2a.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selectproduct {

	public static void main(String[] args) throws InterruptedException 
	{
     
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\cross\\executables\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("atrathod12194@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("A@tul12194");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
	driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
	driver.findElement(By.xpath("//input[@id='cgv']")).click();
	driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
	driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
	WebElement txt=driver.findElement(By.xpath("//div[@class='box']"));
	String actual=txt.getText();
	
	}

}
