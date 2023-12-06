package org.facebook;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook extends Base{
	
	@Test
	private void face(){
		
		lanchBrowser("chrome");
		lanchUrl("https://www.facebook.com/");
		maximize();
		timeOuts();
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		
//		WebElement btnMonth = driver.findElement(By.id("month"));
		List<WebElement> elements = driver.findElements(By.xpath("//option[text()='18']/preceding-sibling::option/following-sibling::option"));
		//btnCreate.click();
//		Select s= new Select(btnMonth);
		//s.selectByIndex(3);
//		List<WebElement> list = s.getOptions();
		for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);
			String text = element.getText();
			//String text = element.getAttribute("value");
			System.out.println(text);
//			if(text.equals("Apr")){
//				s.selectByIndex(i);
//			}
//			else{
//				
//				System.out.println("The search name is empty");
//				
//				
//			}
//			 
//		}
//		String str = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getAttribute("innerText");
//		if(str.equals("Forgotten password?")){
//			System.out.println("The search name is sucess");
//		}
//		else{
//			System.out.println("The search name is empty");
//		}
		}}
	

}
