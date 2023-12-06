package org.flipkart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Flipkart extends Base {
@Test
private void test1(){
	lanchBrowser("chrome");
	lanchUrl("https://www.flipkart.com/");
	maximize();
	timeOuts();
	
	WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btnClose.click();
	
	WebElement txtsearch = driver.findElement(By.name("q"));
	txtsearch.sendKeys("iphones");
	
	WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
	btnClick.click();
	int nameCount=0,priceCount=0;
	String text = null;
	List<WebElement> phoneName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for (int i = 0; i < phoneName.size(); i++) {
		WebElement name = phoneName.get(i);
		text = name.getText();
		System.out.println(text);
		nameCount++;
	}
	List<Integer> li = new ArrayList<Integer>();
	List<WebElement> phonePrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	for (int i = 0; i < phonePrice.size(); i++) {
		WebElement price = phonePrice.get(i);
		String priceText = price.getText();
		//System.out.println(priceText);
		priceCount++;
		if(priceText.contains(",")){
			String pr = priceText.replaceAll(",", "");
			String sbb = pr.substring(1);
			int parseInt = Integer.parseInt(sbb);
			System.out.println(parseInt);
			li.add(parseInt);
		}
	}
	System.out.println("name-----------"+nameCount);
	System.out.println("price----------"+priceCount);
	System.out.println();
	Collections.sort(li);
	System.out.println(li);
	Integer in = li.get(0);
	System.out.println(in);
	
	
	
	Map<List<Integer>, String> mp= new LinkedHashMap<List<Integer>, String>();
	mp.put(li, text);
	System.out.println(mp);
	System.out.println("size--------"+mp.size());
	System.out.println("keys--------"+mp.keySet());
	System.out.println("value--------"+mp.values());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
