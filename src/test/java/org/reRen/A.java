package org.reRen;

import java.util.Scanner;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(WithoutKnown.class)
public class A {
	@Test
	private void test1() {
		System.out.println("test1");

	}
	@Test
	private void test2() {
		System.out.println("test2");

	}
//	@Test(retryAnalyzer=WithKnown.class)
//private void test3() {
//	Assert.assertTrue(false);
//	System.out.println("test3");
//
//}
	
	@Test
private void test3() {
	//Assert.assertTrue(false);
		Scanner sc = new Scanner(System.in);
		Assert.assertTrue(sc.nextBoolean());
	System.out.println("test3");

}
}