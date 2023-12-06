package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.TakesScreenshot;

public class Interview {
	public static void main(String[] args) {
		
//		int a = 10;
//		if(a%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//			
//		}
		//row count
//		int count = 0;
//		int sum = 0;
//		for (int i = 0; i < 10; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//				count++;
//				sum=sum+i;
//			}
//			
//		}
//		System.out.println("count is"+count);
//		System.out.println(sum);
//		reverse num
//		int a = 123456;
//	   int i=0,j=0;
//	   while (a>0) {
//		i=a%10;
//		j=i+(j*10);
//		a=a/10;
//		
//	}
//	   System.out.println(j);
//	   

//palindrome
//		int a=151;
//		int temp=a;
//		int i= 0,j=0;
//		while (temp>0) {
//			i=temp%10;
//			j=i+(j*10);
//			temp=temp/10;
//			
//					
//		}
//	   System.err.println(j);
//	   if(a==j) {
//		   System.out.println("palindrome");
//	   }
//	   else {
//		   System.out.println("not palindrome");
//	   }
//	   
	 //sum of digits
//		int a=123456,x=0;
//		int d = 0;
//		while (a>0) {
//			x=a%10;
//			d=d+1;
//			a=a/10;
//			
//			
//		}
//	System.out.println(d);
	
//	int a=1;
//	for (int i = 1; i < 6; i++) {
//		a=a*i;
//		
//	}
//	System.out.println(a);	
//		
//		int n1 = 0;
//	    int n2= 1;
//	    int n3 = 0;
//	   System.out.println("----"+n1);
//	   System.out.println("----"+n2);
//	   for (int i = 0; i < 5; i++) {
//		   n3=n1+n2;
//		   System.out.println("----"+n3);
//		   n1=n2;
//		   n2=n3;
//		
//	}
//	 String s="welcome";
//	 String res ="";
//	 for (int i = s.length()-1; i >=0; i--) {
//		res=res+ s.charAt(i);
//		System.out.println(res);
//	}
	 
//	 String s1 ="ajeeja";
//	 String r = "";
//	 for (int i = s1.length()-1; i >=0; i--) {
//		 char charAt = s1.charAt(i);
//		 r=r+charAt; 
//		 System.err.println(r);
//		 if(s1.equals(r)) {
//				System.out.println("palindrome");			 
//		
//		}
//	 
//	 
//	}
//	 String s2 = "welcome to java";
//	 String s3="";
//	 for (int i = s2.length()-1; i >=0; i--) {
//		 char c = s2.charAt(i);
//		 s3=s3+c;
//		
//	}
//	 System.out.println(s3);
		
//		String s = "welcome to java";	
//		String r ="";
//		String[] sp = s.split(" ");
//		for (int i = 0; i < sp.length; i++) {
//			for (int j = sp[i].length()-1; j >=0; j--) {
//				char ch = sp[i].charAt(j);
//				r=r+ch;
//				
//				
////				if(r.equals("emoclew")) {
////					//r=r+" ";
////					System.err.println(r);
////					System.out.println("---");
////					break;
//			//}
//			
//			}
//			System.out.println(r);
//		}
//		
//		String s = "welcome";
//		int vc = 0;
//		int nvc = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char at = s.charAt(i);
//			if(at=='A'||at=='E'||at=='I'||at=='O'||at=='U'||at=='a'||at=='e'||at=='i'||at=='o'||at=='u') {
//				System.out.println(at);
//				vc+=1;
//			}
//			else {
//				//System.out.println(at);
//				nvc+=1;
//			}
////			System.out.println(vc);
////			System.out.println(nvc);
//		}
//		System.out.println(vc);
//		System.out.println(nvc);	
//	}
	
		//String s ="WELComE23456";
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if(Character.isUpperCase(c)) {
//				//System.out.println(c);
//			}
//		}
//		for (int i = 0; i < s.length(); i++) {
//			char at = s.charAt(i);
//			if(Character.isLowerCase(at)) {
//				System.out.println(at);
//			}
//		}
//		for (int i = 0; i < s.length(); i++) {
//			char charAt = s.charAt(i);
//			if(Character.isDigit(charAt)) {
//				System.out.println(charAt);
//			}
//		}
//		int a1=0;
//		int nu=0;
//		int spc=0;
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if(Character.isAlphabetic(c)) {
//				//System.out.println(c);
//				a1+=1;
//			}
//			else if(Character.isDigit(c)) {
//				nu=nu+1;
//			}
//			else {
//				spc=spc+1;
//				
//			}
//		
//		}
//		System.out.println("alp"+a1);
//		System.out.println("num"+nu);
//		System.out.println("spcia"+spc);
//	
//		String s1="welcome";
//		String s2="";
//		char[] cs = s1.toCharArray();
//		for (int i = 0; i < s1.length(); i++) {
//			char c1 = s1.charAt(i);
//			
//				if(!s2.contains(String.valueOf(c1))) {
//					s2=s2+c1;
//				}
//			
//		}
//		System.out.println(s2);
////		
//		String s ="welcooommmeeeee";
//		char[] cs = s.toCharArray();
//		Map<Character, Integer> mp=new LinkedHashMap<Character, Integer>();
//		for (char c : cs) {
//			if(mp.containsKey(c)) {
//				Integer count = mp.get(c);
//				mp.put(c, count+1);
//			}
//			else {
//				mp.put(c, 1);
//			}
//			
//		}
//		
//		System.out.println(mp);
		
//		String s1 ="welcome welcome to to to to ajva java ";
//		Map<String, Integer>mp=new LinkedHashMap<>();
//		String[] cs = s1.split("a");
//		for (String c : cs) {
//			if(mp.containsKey(c)) {
//				Integer count = mp.get(c);
//				mp.put(c, count+1);
//			}
//			else {
//				mp.put(c, 1);
//			}
//			
//		}
//		
//		System.out.println(mp);
//		
//		int []a= {1,5,3,8,6};
//		int temp = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//						a[j]=temp;	
//					
//				}
//				
//					
//			}
//		}
//		for (int i : a) {
//			System.out.print(i);
//			
//		}
//		int n1=0;
//		int n2=1,n3;
//	for (int i = 0; i <=10; i++) {
//		n3=n1+n2;
//		n1=n2;
//		n2=n3;
//		System.err.print(" "+n3);
//	}
				
		
		 String s1 = "abdf";
		
		 for (int i = s1.length()-1; i >=0; i--) {
			 char c = s1.charAt(i);
			 System.out.println(c);
			
		}
		 
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
}
		
		
}	 
	
	


