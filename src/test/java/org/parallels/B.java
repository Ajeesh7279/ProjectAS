package org.parallels;

import org.testng.annotations.Test;

public class B {
	@Test
	private void testB1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testb1");

	}
	@Test
	private void testB2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("testb2");

	}
	@Test
private void testB3() {
		System.out.println(Thread.currentThread().getId());
	System.out.println("testb3");

}
}