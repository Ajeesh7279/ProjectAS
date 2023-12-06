package org.loginPage;

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

public class BookMyPage extends Base {
	@BeforeClass
	private void beforeclass () {
		lanchBrowser("chrome");
		lanchUrl("https://in.bookmyshow.com/");
		
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
		Logins lo = new Logins();
		
		btnClick(lo.getBtnClickNot());
		btnClick(lo.getBtnClickche());
		btnClick(lo.getBtnClickvenom());
		btnClick(lo.getBtnClickBook());
		btnClick(lo.getBtnClick3D1());
		btnClick(lo.getBtnClick31());
		btnClick(lo.getBtnClickTime());
		//btnClick(lo.getBtnClickAccept());
		btnClick(lo.getBtnClickcar());
		btnClick(lo.getBtnClickSeat());
	
//		WebElement table = driver.findElement(By.xpath("//table[@class='setmain']"));
//		
//		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
//		for (int i = 0; i < tableRows.size(); i++) {
//			WebElement rows = tableRows.get(i);
//			String text = rows.getText();
//			System.out.println(text);
//			System.out.println("-------------------");
//			WebElement findElement = rows.findElement(By.tagName("td"));
//			String text2 = findElement.getText();
//			System.out.println(text2);
//			
//		}
		btnClick(lo.getBtnClickSeat1());
		btnClick(lo.getBtnClickSeat2());
		btnClick(lo.getBtnClickSeat3());
		btnClick(lo.getBtnClickSeat4());
		btnClick(lo.getBtnClickPay());
		btnClick(lo.getBtnClickProceed());
		
		
		
		
		
		
	
	}	
}
