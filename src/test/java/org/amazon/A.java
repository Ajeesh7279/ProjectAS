package org.amazon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	@Test(dataProvider="login")
	private void testA1(String user,String pass) {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testa1");

	}
	@Test
	private void testA2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testa2");

	}
	@Test
private void testA3() {
		System.out.println(Thread.currentThread().getId());
	System.out.println("testa3");

}
	@DataProvider(name="login",indices= {1,2})
	private Object[][] data() {
		Object [][] obj = new Object [][] {
			
			{"Ajeesh","1233454"},	
			{"Ajsh","1233454"},
			{"manoj","1233454"},
			{"karthi","1233454"}
		};
		return obj;
	
	
		
              
	}
}