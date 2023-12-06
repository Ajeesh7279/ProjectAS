package org.interview;

public class Practice {
	
	public static void main (String[] args){
		
	String s= "Ajeesh";
	for(int k=0;k<s.length();k++ ){
		System.out.print(k);
	}
	System.out.println();
	for(int i= s.length()-1; i>=0;i-- ){
		char ch = s.charAt(i);
		System.out.print(ch);
	}
	System.out.println();
            int a =123456;
		int i=0,j=0;
		while(a>0){
			i=a%10;
			j=i+(j*10);
			a=a/10;
			System.out.println(" "+j);
		}
		
	}

}
