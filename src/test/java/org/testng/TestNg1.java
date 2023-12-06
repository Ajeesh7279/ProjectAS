package org.testng;

import java.util.Date;

import org.base.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg1 extends Base {
	 
//	@BeforeClass
//	private void beforeClass() {
//		System.out.println("before class");
//	}
//	@AfterClass
//	private void afterClass() {
//		System.out.println("after class");
//		
//
//	}
//	@BeforeMethod
//	private void beforeMethod() {
//		System.out.println("beforeMethod");
//		
//
//	}
//	@AfterMethod
//	private void afterMethod() {
//    System.out.println("afterMethod");
//
//	}
//	@Test(priority = 3,invocationCount=3)
//	private void test1() {
//		System.out.println("Test1");
//
//	}
//	@Test(priority = 1)
//	private void test2() {
//		System.out.println("Test 2");
//	}
//	@Test(priority = 2,enabled = true)
//	private void test3() {
//		System.out.println("Test 3");
//	}
//	
	@BeforeClass
	private void beforeClass() {
		lanchBrowser("chrome");
		
		maximize();
		timeOuts();
		System.out.println("before class");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("after class");
		

	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod "+new Date());
		

	}
	@AfterMethod
	private void afterMethod() {
    System.out.println("afterMethod "+new Date());

	}
	@Test()
	private void test1() {
		lanchUrl("https://www.facebook.com/");
//		SoftAssert s= new SoftAssert();
//		s.assertTrue(getCurrentUrl().contains("facebok"),"verify url");
//		LoginPageFace lo = new LoginPageFace();
//		fillTextBox(lo.getTxtUsername(), "Ajeesh");
//		s.assertEquals(getAttribute(lo.getTxtUsername()), "Ajesh","verify name");
//		
//		fillTextBox(lo.getTxtPassword(), "12345");
//		s.assertEquals(getAttribute(lo.getTxtPassword()), "12345","verify pass");
//		
//		//btnClick(lo.getBtnLogin());
//		s.assertAll();
//		System.out.println("Test1");
                

//	}
//	@Test(priority = 1,enabled = false)
//	private void test2() {
//		System.out.println("Test 2");
//	}
//	@Test(priority = 2,enabled = false)
//	private void test3() {
//		System.out.println("Test 3");
	}
	

}
