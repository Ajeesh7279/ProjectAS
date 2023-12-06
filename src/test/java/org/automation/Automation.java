package org.automation;

import java.util.Date;

import org.base.Base;
import org.poms.UserRegistraction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation extends Base {
	@BeforeClass
	private void beforeclass() {
		lanchBrowser("chrome");
		lanchUrl("http://automationpractice.com/index.php");
	
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
		System.out.println("test starts---"+new Date());
		 System.out.println("before");

	}
	@AfterMethod
	private void afterMethod() {
	
		    System.out.println("test end ....."+new Date());
		System.out.println("after");


	}
   
	@Test
	private void test(){
		
		UserRegistraction ur=new UserRegistraction();
		
		btnClick(ur.getBtnSignIN());
		fillTextBox(ur.getTxtEmailAddress(), "aje123456@gmail.com");
		btnClick(ur.getBthCreateAccount());
		btnClick(ur.getBtnRadio());
		fillTextBox(ur.getTxtFirstName(), "aje");
		fillTextBox(ur.getTxtastName(), "as");
		fillTextBox(ur.getTxtpassword(), "12345678");
		dropDown(ur.getBtnDays(), "13");
		
		
		
		
	}

}
