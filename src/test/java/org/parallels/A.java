package org.parallels;

import org.testng.annotations.Test;

public class A {
	@Test
	private void testA1() {
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
}