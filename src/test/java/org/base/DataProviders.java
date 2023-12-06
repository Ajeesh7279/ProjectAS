package org.base;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider(name="login")
	private Object[][] data() {
		Object [][] obj = new Object [][] {
			
			{"Ajeesh7279","87540861","17/10/2021","26/10/2021","Ajeesh","AS","Ajeesh,MallenCode","9876543210987654","123"}	
			
			
		};
		return obj;
	
	
		
              
	}
	
	
	
	
	
	
	
	
	
	

}
