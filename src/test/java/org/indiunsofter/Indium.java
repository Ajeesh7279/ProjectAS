package org.indiunsofter;

import java.util.ArrayList;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Indium extends Base{
	static WebElement e;
	public static WebElement indium( String browser) {
		
		switch(browser){
		case "SERVICES":
			 List<WebElement> list = driver.findElements(By.xpath("//li[@id='wp-megamenu-item-208']/following-sibling::li/preceding-sibling::li"));
				for (int i = 0; i < list.size(); i++) {
					WebElement e = list.get(i);
//					//System.out.println(e.getText());
//					if(e.equals("DIGITAL ACCELERATORS")){
//						moveToElement(e);
//					}
					e.click();
					break;	
				}
		case "DIGITAL ACCELERATORS":
			List<WebElement> list1 = driver.findElements(By.xpath("//li[@id='wp-megamenu-item-208']/following-sibling::li/preceding-sibling::li"));
			for (int i = 0; i < list1.size(); i++) {
				WebElement e = list1.get(i);
				//System.out.println(e.getText());
			//	
			e.click();
			break;
			}	
			
			
		case "PARTNERS":
			List<WebElement> list2 = driver.findElements(By.xpath("//li[@id='wp-megamenu-item-208']/following-sibling::li/preceding-sibling::li"));
			for (int i = 0; i < list2.size(); i++) {
				WebElement e = list2.get(i);
				//System.out.println(e.getText());
			//	
			e.click();
			break;
			}	
		
		
		case "INSIGHTS":
			e.click();
			
			break;
			
		case "ABOUT":
			e.click();
			break;
		case "CAREERS":
			e.click();
		break;
		case "CONTACT":
			e.click();
		break;
		case "INQUIRE NOW":
			e.click();
		break;	
		
			
			
		}
		return null;
		

	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	
		lanchBrowser("chrome");
		lanchUrl("https://www.indiumsoftware.com/");
		maximize();
		timeOuts();
		//List<WebElement> li = new ArrayList<>();
//		 List<WebElement> list = driver.findElements(By.xpath("//li[@id='wp-megamenu-item-208']/following-sibling::li/preceding-sibling::li"));
//		for (int i = 0; i < list.size(); i++) {
//			WebElement element = list.get(i);
//			System.out.println(element.getText());
//			li.add(element);
			
		//}
		indium("PARTNERS"); 
		
		
	}









	
}
