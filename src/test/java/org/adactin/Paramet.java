package org.adactin;

import java.util.Date;

import org.base.Base;

import org.testng.annotations.*;


public class Paramet extends Base {

	@BeforeClass
	private void beforeclass() {
		lanchBrowser("chrome");
		
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
    @Parameters(  {"userName","userPass","dateIn","dateout"})
	@Test
	private void test1(String user,String pass,String in,String out) throws InterruptedException {
    	lanchUrl("https://adactinhotelapp.com/");
		LoginPageAdactin lo = new LoginPageAdactin();
		fillTextBox(lo.getTxtusername(), user);
		fillTextBox(lo.getTxtpassword(), pass);
		btnClick(lo.getBtnlogin());
		
		selectByIndex(lo.getBtnClickLoc(), 5);
		
		selectByIndex(lo.getBtnClickHot(), 2);
	
		selectByIndex(lo.getBtnClickRoom(), 2);
		
		selectByIndex(lo.getBtnClickNos(), 2);
		
		lo.getBtnClickDateIn().clear();
		fillTextBox(lo.getBtnClickDateIn(), in);
		
	    lo.getBtnClickDateOut().clear();
	    fillTextBox(lo.getBtnClickDateOut(), out);
	    
//	     selectByIndex(lo.getBtnClickAdult(), 2);
//	   
//	    selectByIndex(lo.getBtnClickChild(), 1);
//	    
//	    //btnClick(lo.getBtnClickSearch());
//	  btnClick(lo.getBtnClickSea());
//	    
//	    btnClick(lo.getBtnClickRad());
//	    
//	    btnClick(lo.getBtnClickCon());
//	    
//	    fillTextBox(lo.getTxtNameFirst(), first);
//	    
//	    fillTextBox(lo.getTxtNameLast(), last);
//	    
//	    fillTextBox(lo.getTxtAddress(), addr);
//	    
//	    fillTextBox(lo.getTxtCard(), card);
//	    
//	    selectByIndex(lo.getTxtCardType(), 2);
//	    
//	    selectByIndex(lo.getBtnClickMonth(), 1);
//	    
//	    selectByIndex(lo.getBtnClickYear(), 12);
//	    
//	    fillTextBox(lo.getTxtcvv1(), cv);
//	    
//	    btnClick(lo.getBtnClickBook());
//	    
//	    String st = lo.getTxtOrder().getAttribute("value");
//	 System.out.println("get id no is-------"+st);
//	
			 
			 
			 
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
