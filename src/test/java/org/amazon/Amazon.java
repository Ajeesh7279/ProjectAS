package org.amazon;

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
		Login lo = new Login();
		
	fillTextBox(lo.getTxtSearch(), "iphones");
	btnClick(lo.getBtnClick());
//	 WebElement allText = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span"));
//	String text = allText.getText();
//	System.out.println(text);
//	
	
	
	List<WebElement> li = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	for (int i = 0; i < li.size(); i++) {
		WebElement alltext = li.get(i);
		String text2 = alltext.getText();
		System.out.println(text2);
		
	
	
	
	}
		
	
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	List<String> lis = new ArrayList<>();
	for (int i1 = 0; i1 < price.size(); i1++) {
		WebElement allprice = price.get(i1);
		
		String text = allprice.getText();
		//System.out.println(text);
		String string = text.toString();
		//System.out.println(text);
		 
		 if(string.contains(",")) {
			 
			String st = string.replace(",", "");
			//System.out.println(st);
			//int asc = Integer.parseInt(st);
			
			lis.add(st);
			
//			System.out.println(lis);
			
			Collections.max(lis);
			Collections.min(lis);
	        		
//			int asc = Integer.parseInt(st);
//			int [] asc1 = new int[] {asc};
//			int temp;
//			for (int i = 0; i < asc1.length; i++) {
//				for (int j = 0; j < asc1.length; j++) {
//					if(asc1[i] > asc1[j]) {
//						temp = asc1[i];	
//						asc1[i] = asc1[j];
//						asc1[j] = temp;
//					}
//					
//		
//				}
//					
//					
//				}
		 }		
	 }
	Collections.sort(lis);
	System.out.println(lis);
	System.out.println(Collections.max(lis));
	System.out.println(Collections.min(lis)); 
	 
	
	//	 int st = 0;
//	if(st <= st) {
//		
//		
//	}}
//	 
//	// int asc = Integer.parseInt(string.replace(",", ""));
//	 
//	 int [] asc1 = new int[] {asc};
//	 String temp;
//	 for (int i = 0; i < asc1.length; i++) {
//		for (int j = 0; j < asc1.length; j++) {
			
			
					
			
		}
	//Collections.sort(li, price);
			 
	 
	// List li = new ArrayList();
	 
	 
	 
	 
//		 Map<String, String>map = new TreeMap<>();
//			map.put(text2, text);
//			Set<String> keySet = map.keySet();
//			//List<String> lis = new ArrayList<>(keySet);
//			System.out.println(keySet);
	 }	
		
		
	
	
	
	
	 
	
	 
//	Set<WebElement> se = new TreeSet<>();
//	  se.addAll(price);
//	  
//	  
//	  String string = se.toString();
//	  System.out.println(string);
//	//System.out.println(se);
////	for (WebElement as : se) {
////		String text1 = as.getText();
////		System.out.println(text1);
////	}
//	
//	String string2 = price.toString();
//	Set<String> string21 = new TreeSet<>();
//	//System.out.println("string21");
//	for (String as : string21) {
//		//String text1 = as.getText();
//		System.out.println(as);
//	
//	}
//	
	     
	
		
	

	
