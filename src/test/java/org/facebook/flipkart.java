package org.facebook;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Footer;
import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class flipkart extends Base {
	
	@Test
	private void test(){
		
		lanchBrowser("chrome");
		lanchUrl("https://www.flipkart.com");
		maximize();
		timeOuts();
		
		WebElement btnClose=driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
	btnClose.click();
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("iphones");
	WebElement btnClick = driver.findElement(By.xpath("//*[@class='L0Z3Pu']"));
	btnClick.click();
	String name = null;
	List<WebElement> phoneName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	                for (int i = 0; i < phoneName.size(); i++) {
	                	WebElement elementName = phoneName.get(i);
						 name = elementName.getText();
						System.out.println(name);
					}
	               // char[]cs=null;
	                List<Integer> li = new LinkedList<Integer>();
	                List<WebElement> phoneCost = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	              for (int i = 0; i < phoneCost.size(); i++) {
					WebElement elementCost = phoneCost.get(i);
					String cost = elementCost.getText();
					if(cost.contains(",")){
						String replace = cost.replaceAll(",", "");
						String substring = replace.substring(1);
						char[] cs = substring.toCharArray();
						 //System.out.println(cs);
						 int parseInt = Integer.parseInt(substring);
						//System.out.println(parseInt);
						li.add(parseInt);
					}
					
				}
	              Collections.sort(li);
	             // System.out.println(li.get(16));
	              
	              Map<Integer, String> mp = new LinkedHashMap<Integer, String>();
	              mp.put(li.get(17), name);
	              System.out.println(mp);
	              
	              
	              
	              
	              
	              
	              
	              
//	              int a[]= new int[li.size()];
//	              Object[] array = li.toArray();
//	              System.out.println(array[1]);
//	              //System.out.println(a[0]);
//	              int temp=0;
//	             for (int i = 0; i <li.size(); i++) {
//					for (int j = 0; j < li.size(); j++) {
//						if(a[i]<a[j]){
//							temp=a[i];
//							a[i]=a[j];
//							a[j]=temp;
//						}
//						
//					}
//				}
//	             for (int c : a) {
//	            	 System.out.println(c);
//					
//				}
	
	
	
	}
	
	
	

}
