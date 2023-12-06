package org.adactin;

import java.util.Scanner;

class B {
	public static void main(String[] args) {
		
		int [] a= {60,40,30,70,10,50};
		int temp;
		for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
				
			}
			
		}	
			
			
		}
		
		for (int i : a) {
			System.out.println(i);
		}
		//String s = "welcome";
//		 boolean em= s.isEmpty();
//		System.out.println(em);
//		
//		char charAt = s.charAt(2);
//		System.out.println(charAt);
//		
//		int indexOf = s.indexOf('c');
//		System.out.println(indexOf);
//		
//		int lastIndexOf = s.lastIndexOf('e');
//		System.out.println(lastIndexOf);
//		
//		String s1 = "welcome";
//		boolean startsWith = s1.contains("come");
//		System.out.println(startsWith);
//		System.out.println(s1.contains("me"));
//		System.out.println(s1.contains("to"));
//		System.out.println(s1.contains("java"));
//		System.out.println(s1.contains("co"));
//		
//		String s2 = "hello";
//				String replace = s2.replace('e', '#');
//		System.out.println(replace);
//		String s3 = "WelcoME";
//				String upperCase = s3.toUpperCase();
//		System.out.println(upperCase);
//		
//		String s4 = "Hello";
//		String s5 = "hello";
//		System.out.println(s4==s5);
//		
//		boolean equals = s4.equals(s5);
//		System.out.println(equals);
//		boolean equalsIgnoreCase = s4.equalsIgnoreCase(s5);
//		System.out.println(equalsIgnoreCase);
//		System.out.println(s4+s5);
//		String concat = s4.concat(s5);
//		System.out.println(concat);
//		
//		String s7 = "welcome to java";
//		String substring = s7.substring(5);
//		System.out.println(substring);
//		String substring2 = s7.substring(5, 13);
//		System.out.println(substring2);
//		
//		String[] split = s7.split("");
//		System.out.println(split.length);
//		
//		for (String string : split) {
//			System.out.println(string);
//			
//		}
		
		
		
	
	}
	
	
	
	

}
