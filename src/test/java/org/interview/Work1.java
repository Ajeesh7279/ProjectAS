package org.interview;

public class Work1 {
	
	public static void main(String[] args) {
//		int count=0;
//		for (int i = 0; i < 10; i++) {
//			if(i%2==0){
//				System.out.println(i);
//				count++;
//			}
//			
//			
//		}
//		System.out.println(count);
//		
//		String s = "Ajeesh is a good boy";
//		for (int i = s.length()-1; i >=0; i--) {
//			char at = s.charAt(i);
//			System.out.print(at);
//			
//		}
//		System.out.println();
//		
//		String sp []=s.split(" ");
//		String res = "";
//		for(int i=0;i<sp.length;i++){
//			for (int j=sp[i].length()-1;j>=0;j--) {
//				char ch  = sp[i].charAt(j);
//				res =res+ch;
//				
//				
//			}
//			res = res+" ";
//			
//		} 
//		System.out.print(res);
//		System.out.println();
//		
//		int a = 13576,i=0,j=0;
//		while(a>0){
//			i=a%10;
//			j=i+(j*10);
//			a=a/10;
//			
//		}
//		System.out.println(j);
//		System.out.println();
//		int b=1468;
//		int k=0,l=0;
//		while(b>0){
//			k=b%10;
//			l=l+k;
//			b=b/10;
//			
//			
//		}
//		System.out.println(l);	
//		
//		int c []={2,5,1,3,8,6};
//		int temp = 0;
//		for(int i=0;i<c.length;i++){
//			for(int j=0;j<c.length;j++){
//				if(c[i]<c[j]){
//					temp=c[i];
//					c[i]=c[j];
//					c[j]=temp;
//					
//					
//				}
//			}
//		}
//		for(int x:c){
//			System.out.println(x);
//		}
//		String s="ajeesh";
//		int vc=0,nvc=0;
//		for(int i=0;i<s.length();i++){
//			char at = s.charAt(i);
//			if(at=='a'||at=='e'||at=='i'||at=='o'||at=='u'){
//			//	System.out.println(at);
//				//vc++;
//			}
//			else{
//				System.out.println(at);
//			nvc=nvc+1;
//			}
//		}
//		System.out.print(vc); 
//		System.out.print(nvc);
	
//		String s = "AJEESH12345@#$    aaahhhh";
//		int u=0,l=0,a=0,spa=0,spe=0;
//		for (int i = 0; i < s.length(); i++) {
//			char at = s.charAt(i);
//			if(Character.isUpperCase(at)){
//				System.out.println(at);
//				u++;
//			}
//			else if(Character.isLowerCase(at)){
//				System.out.println(at);
//				l++;
//			}
//			else if(Character.isDigit(at)){
//				System.out.println(at);
//				a++;
//			}
//			else if(Character.isSpaceChar(at)){
//				System.out.println(at);
//				spa++;
//			}
//			else{
//				System.out.println(at);
//				spe++;
//			}
//		}
//		System.out.println(u+"upper");
//		System.out.println(l+"lower");
//		System.out.println(a+"dight");
//		System.out.println(spa+"Space");
//		System.out.println(spe+"special");
		
//		String str = "ajeesy";
//		if(str.contains("y")){
//			String s=str.replace("y", "h");
//			System.out.println(s);
//		}
//		int n1=0,n2=1,n3=0;
//		for (int i = 0; i < 5; i++) {
//			n3=n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//			
//		}
//		int a = 1551;
//		int temp = a;
//		int i=0,j=0;
//		while(temp>0){
//			i=temp%10;
//			j=i+(j*10);
//			temp=temp/10;
//		}
//		if(a==j){
//			System.out.println("palindrome");
//		}
//		else{
//			System.out.println("not palindrome");
//		}
//		
//		System.out.println("=====");
//		
//		
//	}
	
	try{
		System.out.println(10/0);
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("inner catch");
		}finally {
			System.out.println("inner final");
		}
		
	}catch(ArithmeticException e){
		System.out.println("outer catch");
		
	}
	finally {
		System.out.println("outer final");
	}
	
	}
}
