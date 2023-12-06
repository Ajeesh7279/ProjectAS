package org.adactin;

import java.util.Date;

import org.base.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping extends Base {
//	@BeforeClass
//	private void beforeclass() {
//		lanchBrowser("chrome");
//		lanchUrl("https://adactinhotelapp.com/");
//		maximize();
//		timeOuts();
//		System.out.println("before class");
//
//	}
//	@AfterClass
//	private void afterclass() {
//	
//    System.out.println("before");
//    
//	}
//	@BeforeMethod
//	private void beforeMethod() {
//		 System.out.println("test starts ....."+new Date());
//		 System.out.println("before");
//
//	}
//	@AfterMethod
//	private void afterMethod() {
//	
//		    System.out.println("test end ....."+new Date());
//		System.out.println("after");
//
//
//	}

	@Test(groups= {"smoke","regression"})
	private void test1() {
	System.out.println("Test1");	
		
	}
	@Test(groups= {"sanity","regression"})
	private void test2() {
		System.out.println("Test2");	
		
	}
	@Test(groups = "regression")
	private void test3() {
		
		System.out.println("Test3");	
	}
	@Test(groups = "retest")
	private void test4() {
		
		System.out.println("Test4");	
	}
	@Test(groups= {"smoke","regression"})
	private void test5() {
		System.out.println("Test5");	
		
	}
	
	@Test(groups= {"sanity","regression"})
	private void test6() {
		System.out.println("Test6");	
		
	}
	@Test(groups = "regression")
	private void test7() {
		
		System.out.println("Test7");	
	}
	@Test
	private void test8() {
		System.out.println("Test8");	
		
	}
//	@Test
//	private void test9() {
//		String s = "welcome to java";
//		String[] split = s.split("a");
//System.out.println(s);
//for (String st : split) {
//	System.out.println(st);
//	
//	
//}
	//}
	

}
