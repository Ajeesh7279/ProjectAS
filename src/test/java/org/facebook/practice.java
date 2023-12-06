package org.facebook;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice extends Base {
	@Test
	private void face(){
		
		lanchBrowser("chrome");
		lanchUrl("https://www.facebook.com/");
		maximize();
		timeOuts();
		
		WebElement txtUser=driver.findElement(By.id("email"));
		txtUser.sendKeys("Ajeesh");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123456");
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	btnCreate.click();
	
	 WebElement txtFirst = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
	        txtFirst.sendKeys("Ajeesh");
	        
	WebElement txtSurname = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
	txtSurname.sendKeys("AS");
	
	WebElement txtMobile = driver.findElement(By.xpath("(//*[@type='text'])[4]"));
	txtMobile.sendKeys("8754086149");
	
	WebElement txtPassword = driver.findElement(By.xpath("(//*[@type='password'])[2]"));
	txtPassword.sendKeys("67890");
	
	WebElement btnRadio = driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
	btnRadio.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
