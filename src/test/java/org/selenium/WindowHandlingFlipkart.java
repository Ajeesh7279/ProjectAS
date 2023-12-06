package org.selenium;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandlingFlipkart extends Base {

	@BeforeClass
	private void beforeclass() {
		lanchBrowser("chrome");
		lanchUrl("https:www.flipkart.com/");
		
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
	
	WebElement btnClick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btnClick.click();
	
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("iphones");
	
	WebElement btnSearch = driver.findElement(By.xpath("//button[@type='submit']"));
	btnSearch.click();
	
	WebElement btnPhone = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	btnPhone.click();
	Set<String> st = driver.getWindowHandles();
	
	List<String> li = new ArrayList<>();
	li.addAll(st);
	
	driver.switchTo().window(li.get(1));
	
	WebElement btnCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	btnCart.click();
	
	driver.switchTo().window(li.get(0));
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	}	
}



