package org.indium1;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class Indium extends Base {
	
	@Test
	private void product(){
		lanchBrowser("chrome");
		lanchUrl("https://www.indiumsoftware.com/");
		maximize();
		timeOuts();
		//WebElement btnclick = driver.findElement(By.xpath("//div[@id='chat-bot-widget-close']"));
		//btnclick.click();
		productClick("INSIGHTS");
	}

	public static void productClick(String user){
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@id='wp-megamenu-item-208']/following-sibling::li"));
     
		for (int i = 0; i < list.size(); i++) {
        	WebElement element = list.get(i);
			String text = element.getText();
			System.out.println(text);
			 if(text.equals(user)){
					element.click();
		}
		}
		
	}
	
	
	
	
	
	
	
}
