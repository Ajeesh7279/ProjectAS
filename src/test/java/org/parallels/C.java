package org.parallels;

import org.testng.annotations.Test;

public class C {
	@Test
	private void testC1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testc1");

	}
	@Test
	private void testC2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testc2");

	}
	@Test
private void testC3() {
		System.out.println(Thread.currentThread().getId());
	System.out.println("testc3");

}
}