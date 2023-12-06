package org.interview;

import java.util.Scanner;

public class Interview2 {
	
	 
//	public static String  tim( String string) {
//		Scanner s= new Scanner(System.in);
//		 //System.out.println(tim(s.nextLine()));
//		  String st = s.next(); 
//		int vc = 0;
//		int nvc = 0;
//		for (int i = 0; i < st.length(); i++) {
//			char at = st.charAt(i);
//			if(at=='a'||at=='e'||at=='i'||at=='o'||at=='u') {
//				//System.out.println(at);
//				vc+=1;
//			}
//
//		}
//		//System.out.println(vc);
//return string;
//	}
//	public static void main(String[] args) {
//	
//	}
	
	public static String vowel(String str){
		int vc=0;
		for (int i = 0; i < str.length(); i++) {
			char at = str.charAt(i);
			if(at=='a'||at=='e'||at=='i'||at=='o'||at=='u'){
				vc=vc+1;
			}
			
		}
		System.out.println(vc);
		
		return str;
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(vowel(s.nextLine()));
//		Scanner s1 = new Scanner(System.in);
//		System.out.println(TimeConvert(s1.nextInt()));
//		
	}
//	public static int TimeConvert(int num) {
//		int day = num;
//		int seconds =60*60*24*day;
//		int mins =60;
//		int hours = 24;
//		//System.out.println(day*seconds*mins*hours);
//		System.out.println(seconds);
//		return num;
//		
//	}
	//public static void main(String[] args) {
		
//	int count=0;
//	for(int i=0;i<10;i++){
//		if(i%2!=0){
//			System.out.println(i);
//			count++;
//		}
//		
//		
//	}
//	System.out.println(count);
	
//	int a[] = {1,5,8,4,9};
//	int temp = 0;
//	for (int i = 0; i < a.length; i++) {
//		for(int j=i+1;j<a.length; j++){
//			if(a[i]>a[j]){
//				temp = a[i];
//				a[i]=a[j];
//				a[j]=temp;
//				
//			}
//		}
//		System.err.print(a[i]);
//	}
//	System.out.println();
//	String s = ("Ajeesh");
//	for(int i=0;i< s.length();i++){
//		char at = s.charAt(i);
//		System.err.print(at);
//	}
//	System.out.println();
//	//String s1 = "Ajeesh";
//	Scanner sc1 = new Scanner(System.in);
//	String s1 = sc1.nextLine();
//	for(int i=s1.length()-1;i>=0;i--){
//		char c=s1.charAt(i);
//		System.err.print(c);
//	}
	//System.out.println();
	
//	Scanner sc2 = new Scanner(System.in);
//	String s2 = sc2.nextLine();
//	String s2 = "Ajeesh is a good boy";
//	String res = "" ;
//	String[] sp = s2.split(" ");
//	
//	for (int i = 0; i < sp.length; i++) {
//		for(int j=sp[i].length()-1;j>=0;j--){
//			char c = sp[i].charAt(j);
//			res=res+c;
//			//System.err.print(""+c);
////			if(res.equals("hseejA")){
////				
////				break;
////			}
//			
//			}
//		res=res+"  ";
//		System.out.println(res);
//		}
//		
//	int a=12345;
//	int i=0,j=0,k=0;
//	while (a>0) {
//		i=a%10;
//		j=i+(j*10);
//		k=k+1;
//		a=a/10;
//		
//		
//	}
//	System.out.println(j);
//	System.out.println(k);
//	int a =1234,x=0,y=0;
//	while (a>0) {
//		x=a%10;
//		y=y+1;
//		a=a/10;
//	
//	}
//	System.out.print(y);
//	
	
//	int fact = 1;
//	for (int l = 1; l <=5; l++) {
//		fact= fact*l;
//		System.out.println(fact);
//	}
//	
//	String st = "Welcome";
//	int vc=0,nvc=0;
//	for (int l = 0; l < st.length(); l++) {
//		char at = st.charAt(l);
//		if(at=='a'||at=='e'||at=='i'||at=='o'||at=='u'){
//			vc=vc+1;
//			
//		}
//		else{
//			nvc=nvc+1;
//			
//		}
//	}
//	System.out.println(vc);
//	System.out.println(nvc);
//	
//	String str="WEComE1345";
//	for (int l = 0; l < str.length(); l++) {
//		char c = str.charAt(l);
//		if(Character.isUpperCase(c)){
//			System.out.println(c);	
//		}
//	}
//	System.out.println();
//	for (int l = 0; l < str.length(); l++) {
//		char c = str.charAt(l);
//		if(Character.isLowerCase(c)){
//			System.out.println(c);
//		}
//	}
//	System.out.println();
//	for(int l=0;l<str.length();l++){
//		char c = str.charAt(l);
//		if(Character.isDigit(c)){
//			System.out.println(c);
//		}
//	}
//	
//	
	
		
	}
	
	
	



