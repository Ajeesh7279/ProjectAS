package org.communitymatrimony;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Community extends Base {
	public static void main(String[] args) {
		
	    lanchBrowser("chrome");
	    lanchUrl("http://www.communitymatrimony.com/");
	    maximize();
	    timeOuts();
		  WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		  btnLogin.click();
	      WebElement txtUserName = driver.findElement(By.id("idEmail"));
	    txtUserName.sendKeys("6374085651");
	    WebElement txtPassword = driver.findElement(By.id("password"));
	    txtPassword.sendKeys("cbstest");
	    WebElement btnlog = driver.findElement(By.id("frmsubmit"));
	    btnlog.click();
	    
	    
	    
	    
	    
	    
	}

}
