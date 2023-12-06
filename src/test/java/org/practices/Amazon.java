package org.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	@Test
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("ipones",Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> lis = new ArrayList<>();
		for (int i1 = 0; i1 < price.size(); i1++) {
			WebElement allprice = price.get(i1);
			
			String text = allprice.getText();
			//System.out.println(text);
			String string = text.toString();
			//System.out.println(text);
			 
			 if(string.contains(",")) {
				 
				String st = string.replace(",", "");
//				System.out.println(st);
				int asc = Integer.parseInt(st);
				
				lis.add(asc);
				
//				System.out.println(lis);
				
				Collections.max(lis);
				Collections.min(lis);
		        		
//				int asc = Integer.parseInt(st);
//				int [] asc1 = new int[] {asc};
//				int temp;
//				for (int i = 0; i < asc1.length; i++) {
//					for (int j = 0; j < asc1.length; j++) {
//						if(asc1[i] > asc1[j]) {
//							temp = asc1[i];	
//							asc1[i] = asc1[j];
//							asc1[j] = temp;
//						}
//						
//			
//					}
//						
//						
//					}
			 }	
			
		 }
		int max =0;
		 System.out.println("total list"+lis);
		for (int i = 0; i < lis.size(); i++) {
			for (int j = 0; j < lis.size(); j++) {
				if(lis.get(i)>lis.get(j)){
					max = lis.get(i);
					System.out.println("max amount  "+max);
				}
				
				System.out.println("max amount-  "+max);
			}
			System.out.println("max amount--  "+max);
		}
		
	}
}
