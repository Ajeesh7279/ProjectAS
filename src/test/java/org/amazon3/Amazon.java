package org.amazon3;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Base;
import org.codehaus.plexus.classworlds.strategy.StrategyFactory;
import org.encap.lists;
import org.login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Amazon extends Base {
	
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
	
    System.out.println("after class");
    
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
		Logins lo = new Logins();
		fillTextBox(lo.getTxtSearch(), "iphones");
		btnClick(lo.getBtnSearch());
List<WebElement> phonePage1 = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		    for (int i = 0; i < phonePage1.size(); i++) {
		    	WebElement phoneName1 = phonePage1.get(i);
				String text = phoneName1.getText();
				System.out.println(text);
			}
		    
		 List<WebElement> phoneCost1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 List<String> li = new ArrayList<>();
		    for (int i = 0; i < phoneCost1.size(); i++) {
		    	WebElement cost1 = phoneCost1.get(i);
				String text1 = cost1.getText();
				//System.out.println(text1);
				String string = text1.toString();
				if(string.contains(",")) {
					String replace1 = string.replace(",", "");
					System.out.println(replace1);
					li.add(replace1);
				}
			}
		Collections.sort(li);
		System.out.println(li);
		
		System.out.println(Collections.max(li));
	
		System.out.println(Collections.min(li));
		
		Thread.sleep(5000);
		System.out.println("----page2-----");
		
		WebElement next1 = driver.findElement(By.xpath("//a[text()='Next']"));
		next1.click();
		
		List<WebElement> phonePage2 = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < phonePage2.size(); i++) {
			WebElement phoneName2 = phonePage2.get(i);
			String text2 = phoneName2.getText();
			System.out.println(text2);
		
		}
		List<WebElement> phoneCost2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String> lis = new ArrayList<>();
		for (int i = 0; i < phoneCost2.size(); i++) {
			WebElement cost2 = phoneCost2.get(i);
			String text3 = cost2.getText();
			//System.out.println(text3);
			String string1 = text3.toString();
			if(string1.contains(",")) {
				String replace2 = string1.replace(",", "");
				System.out.println(replace2);
				lis.add(replace2);
			}
		}
		Collections.sort(lis);
		System.out.println(lis);
		System.out.println(Collections.max(lis));
		System.out.println(Collections.min(lis));
		Thread.sleep(10000);
		System.out.println("----page3--------");
		
		WebElement next2 = driver.findElement(By.xpath("//a[text()='Next']"));
		next2.click();
		
		List<WebElement> phonePage3 = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement phoneName : phonePage3) {
			String text4 = phoneName.getText();
			System.out.println(text4);	
		}
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Object obj = js.executeScript(" return arguments[0].getAttribute('value')", phonePage3);
//		String string2 = obj.toString();
//		System.out.println(string2);
		List<WebElement> phoneCost3 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String> list = new ArrayList<>();
		for (WebElement cost3 : phoneCost3) {
			String text5 = cost3.getText();
			//System.out.println(text5);
			String string2 = text5.toString();
			if(string2.contains(",")) {
				String replace3 = string2.replace(",", "");
				System.out.println(replace3);
				list.add(replace3);
//				int in = Integer.parseInt(replace3);
//				int [] a = new int[in] ;
//				int temp;
//				for (int i = 0; i < a.length; i++) {
//				for (int j = i+1; j < a.length; j++) {
//					if(a[i]>a[j]) {
//						temp=a[i];
//						a[i]=a[j];
//						a[j]=temp;
//						
//				
//					}}}		
//				
				}
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.max(list));
		 System.out.println(Collections.min(list));
		
	        
		}}	
	

	

