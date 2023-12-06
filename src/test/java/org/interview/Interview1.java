package org.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Interview1 {
	public static void main(String[] args) {
		int []a = {10,30,60,30,90};
		String[]c= {"ajeesh","red","yellow"};
		List<String>li = new ArrayList<>();
		for (String i : c) {
			li.add(i);
			
			}
		System.out.println(li);
  List<String> list = Arrays.asList(c);
		System.out.println(list);
		
		
		//Collections.addAll(li, a);
		//System.out.println(li);
		List<int[]> asList = Arrays.asList(a);
		System.out.println(asList);
//		List<Integer> li = new ArrayList<>();
//				
//		for (int i : a) {
//		li.add(i);
//		
//		}
//		System.out.println(li);
//		Set<Integer> si = new LinkedHashSet<>();
//		si.addAll(li);
//		System.out.println(si);
	//=============	
//		int count =0;
//		int  evensum=0;
//	for (int i = 0; i <10 ; i++) {
//		if(i%2==1) {
//			System.out.println(i);
//			count++;
//			evensum=evensum+i;
//		}
//	}
//
//	System.out.println(count);
//	System.out.println(evensum);
//		
//		
//	
//	//=============
//	int a=1234567;
//	int i=0,j=0;
//	while (a>0) {
//		i=a%10;
//		j=i+(j*10);
//		a=a/10;
//		
//	}
//	System.out.println(j);
//	
	//=========
//	int a=1441;
//	int temp=a;
//	int i=0,j=0;
//	while (temp>0) {
//		i=temp%10;
//		j=i+(j*10);
//		temp=temp/10;
//		}
//	System.out.println(j);
//		if(a==j) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not polindrome"
//					+ "");
//		}
//	
	
//	String s=("21234");
//	int count = 0;
//	String all=null;
//	
//		
//		if(s.contains("2")){
//			all = s.replaceAll("2", "");
//			
//			
//		}
//		int pi = Integer.parseInt(all);
//		System.out.println(pi);
//		int i=0,j=0;
//		while(pi>0){
//			i=pi%10;
//			j=j+i;
//			pi=pi/10;
//			
//			
//		}
//		
//		System.out.println(j);
	//System.out.println(all);
	//System.out.println(count);
	
	
	
}

}
