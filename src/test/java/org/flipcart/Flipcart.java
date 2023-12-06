package org.flipcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.base.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipcart extends Base {
	
	@BeforeClass
	private void beforeClass() {
		lanchBrowser("chrome");
		lanchUrl("https://www.flipkart.com");
	//	lanchBrowser("https://www.greentech.in/selenium-course-content.html");
		maximize();
		timeOuts();
		System.out.println("beforeclass");
		
		
	}
	@AfterClass
	private void afterClass() {
		System.out.println("after class");

	}
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("beforeMethod------"+d);

	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("aftermethod----"+new Date());

	}
	@Test
	private void test1() throws InterruptedException {
		LoginFlip lo = new LoginFlip();
		btnClick(lo.getBtnCancel());
		fillTextBox(lo.getTxtSearch(), "iphones");
		btnClick(lo.getBtnSearch());
		btnClick(lo.getBtnClick());
		String parent = driver.getWindowHandle();
		
		Set<String> allId = windowHandles();
		for (String eachId : allId) {
			if(!parent.equals(eachId)) {
				switchToWindow(eachId);
			}
			
		}
	    btnClick(lo.getBtnCart());
	    btnClick(lo.getBtnHelp());
	    
	    String parent2 = driver.getWindowHandle();
	    Set<String> allId2 = windowHandles();
	    int count=0;
	    for (String eachId2 : allId2) {
	    	if(count==2) {
	    		switchToWindow(eachId2);
	    	}
			count++;
		}
	    moveToElement(lo.getBtnBabyKids());
	    btnClickTarget(lo.getBtnKid());
	    btnClick(lo.getBtnWatch());
	    Set<String> allId3 = windowHandles();
	    List<String> li = new ArrayList<>();
	    li.addAll(allId3);
	    driver.switchTo().window(li.get(3));
		btnClick(lo.getBtnCartWatch());
		btnClick(lo.getBtnOrder());
		

	}
	

}
