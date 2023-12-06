package org.selenium;

import java.util.Date;
import java.util.Set;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandlingAmazon extends Base {

	@BeforeClass
	private void beforeclass() {
		lanchBrowser("chrome");
		lanchUrl("https:www.amazon.in");
		
		maximize();
		timeOuts();
		System.out.println("before class");

	}
	@AfterClass
	private void afterclass() {
	
    System.out.println("before");
    
	}
	@BeforeMethod
	private void beforeMethod() {
		 System.out.println("test starts ....."+new Date());
		 System.out.println("before");

	}
	@AfterMethod
	private void afterMethod() {
	
		    System.out.println("test end ....."+new Date());
		System.out.println("after");


	}

	@Test
	private void test1() throws InterruptedException {
	
	WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearch.sendKeys("iphones");
	
	WebElement btnClick = driver.findElement(By.id("nav-search-submit-button"));
	btnClick.click();
	
	WebElement btnPhone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	btnPhone.click();
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> allid = driver.getWindowHandles();
	System.out.println(allid);
	
	for (String eachid : allid) {
		if(!parent.equals(eachid))
			driver.switchTo().window(eachid);
		
	}
	WebElement btnCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	btnCart.click();
	
//	String parent2 = driver.getWindowHandle();
//	Set<String> allid2 = driver.getWindowHandles();
//	int count = 0;
//	for (String eachid2 : allid2) {
//		if(count==2) {
//			driver.switchTo().window(eachid2);
//		}
//		count++;	
//		
//	}
//	
//	WebElement btnProceed = driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']"));
//	btnProceed.click();
	Thread.sleep(5000);
	 driver.switchTo().window(parent);
	 Thread.sleep(5000); 
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	driver.close();
	Thread.sleep(5000);
	driver.quit();
	
	
	
	}	
}



