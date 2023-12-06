package org.work;

import java.util.concurrent.TimeUnit;

public class NaveenAutomation extends NaveenMethod {

	public static void main(String[] args) {
		
		chrome();
		  driver.get("https://www.t-mobile.com/tablets");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
//	selectFilter("Brands", "Apple", "Samsung");
//			selectFilter("Deals", "New", "Special offer");
//	selectFilter("Deals", "all");
	selectFilter("Operating System", "Android", "iPadOS", "Other");
		  
		
		
	}


}
