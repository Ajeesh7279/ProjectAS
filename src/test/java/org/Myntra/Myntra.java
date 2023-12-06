package org.Myntra;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Myntra extends Base {
	
	public static void main(String[]args){
		
		lanchBrowser("chrome");
		lanchUrl("https://www.myntra.com");
		maximize();
		WebElement btnMen = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(btnMen);
		//driver.findElement(By.xpath(""))
		
		
		
		
		
	}

}
