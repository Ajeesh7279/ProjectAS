package org.communitymatrimony;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;

public class MuslimMatrimony extends Base {
	
	@BeforeClass
	private void beforeClass() {
		lanchBrowser("chrome");
		lanchUrl("https://www.muslimmatrimony.com/myhome/");
		maximize();
		timeOuts();

	}
	@AfterClass
	private void afterClass(){
		quitBrowser();
	}
	@BeforeMethod
	private void beforeMethod(){
		System.out.println("==beforeclass==="+new Date());	
	}
	@AfterMethod
	private void afterMethod(){
		System.out.println("==afterclass==="+new Date());
		
	}
	@Test(invocationCount = 2)
	private void test1(){
		LoginPageMatrimony lo = new LoginPageMatrimony();
		fillTextBox(lo.getTxtUserId(), "6374085651");
		fillTextBox(lo.getTxtPassword(), "cbstest");
		btnClick(lo.getBtnLogin());
		btnClick(lo.getBtnSkip());
//		try{
//			lo.getBtnClose();
//		}
//		catch(Exception e){
//			 btnClick(lo.getBtnClose());
//		}
		
		btnClick(lo.getBtnClose());
		btnClick(lo.getBtnUpgrade());
		btnClick(lo.getBtnPay());
		fillTextBox(lo.getTxtCardNo(), "9876543219876543");
		selectByIndex(lo.getTxtExpiryMonth(), 12);
		selectByVisibleText(lo.getTxtExpireYear(), "2023");
		fillTextBox(lo.getTxtCvv(), "123");
		btnClick(lo.getBtnPaySecurely());
		
	 
		WebElement txtUserName = driver.findElement(By.id("idEmail"));
		txtUserName.sendKeys("6374085651");
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("cbstest");
		
		WebElement btnLogin = driver.findElement(By.id("frmsubmit"));
		btnLogin.click();
	}

}
