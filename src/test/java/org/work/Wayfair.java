package org.work;

import java.util.List;

import org.apache.poi.xslf.util.PPTX2PNG;
import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Wayfair extends Base {
	@Test
	private void test1() {
//		lanchBrowser("chrome");
//		lanchUrl("https://www.facebook.com/");
//      timeOuts();
//      maximize();
//		WebElement click = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		click.click();
//		
//		WebElement drdMonth = driver.findElement(By.id("month"));
//		Select s = new Select(drdMonth);
//		s.selectByIndex(3);
//		s.selectByValue("4");
//		List<WebElement> options = s.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			WebElement element = options.get(i);
//			System.out.println(element.getText());
//			
		int count=0;
		    for(int i=0;i<10;i++){
		    	if(i%2==0){
		    		System.out.println(i);
		count++;
		    }}
		System.out.println("========="+count);
		int scount=0;
		String s = "Ajeesh";
		for (int i = s.length()-1; i >= 0; i--) {
		char	ct=s.charAt(i);
			scount++;
			System.out.print(ct);
		}
		System.out.println();
		System.out.println(scount);
		
		String st = "Ajeesh go to class";
		String res = "";
		String[] split = st.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1; j >=0; j--) {
				char at = split[i].charAt(j);
				res=res+at;
				
			}
			res=res+" ";
			System.out.println(res);
		}
		int a = 12345;
		int i=0,j=0;
		
		while(a>0){
			i=a%10;
			j=i+(j*10);
			a=a/10;
			System.out.println(j);
		}
		int temp;
		int[] b ={10,40,20,60,50};
		for (int k = 0; k < b.length-1; k++) {
			for (int k2 = k+1; k2 < b.length; k2++) {
				if(b[k]>b[k2]){
				temp=b[k];
				b[k]=b[k2];
				b[k2] = temp;
					
					
				}
			}
			for (int x : b) {
				System.out.println(x);
			}
		
		
		}
		
		
		
		
		
		
		
		
	}
	

}
