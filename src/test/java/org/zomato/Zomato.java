package org.zomato;

import java.util.Date;
import java.util.List;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zomato extends Base {
	@BeforeClass
	private void beforeclass () {
		lanchBrowser("chrome");
		lanchUrl("https://www.zomato.com/");
		
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
	private void test1() {
		
		
		
		
		
		
		
	
	}	
}
