package org.xpaths;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Xpaths extends Base{
	
	@Test
	private void test1() {
//		lanchBrowser("chrome");
//		lanchUrl("https://www.facebook.com/");
//		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		create.click();
//WebElement month = driver.findElement(By.xpath("//option[text()='Mar']//following-sibling::option[3]"));
//Select s= new Select(month);

		Vector<Integer> v= new Vector<>();
		v.add(10);
		v.add(20);
		v.add(50);
		v.add(60);
		v.add(80);
		v.add(90);
		v.add(20);
		
//		Enumeration<Integer> ee = v.elements();
//		while(ee.hasMoreElements()) {
//			Integer i = ee.nextElement();
//			System.out.println(i);
//		}
//		System.out.println();
//		Iterator<Integer> it = v.iterator();
//		while (it.hasNext()) {
//			Integer next = it.next();
//			System.out.println(next);
//			if(next==50) {
//				it.remove();
//			}
//			
//			
//		}
		System.out.println(v);
		System.out.println();
		ListIterator<Integer> lis = v.listIterator();
		while (lis.hasNext()) {
			Integer n = lis.next();
			System.out.println(n);
			if(n==10) {
				lis.remove();
			}
		}
		System.out.println(v);
		while (lis.hasPrevious()) {
			Integer p = lis.previous();
			System.out.println(p);
		}
		System.out.println(v);
		
		
		

     	}

}
	