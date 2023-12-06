package org.adactin;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AdactinHotelsExcelBook extends Base {
	
	@BeforeClass
	private void beforeclass() {
		lanchBrowser("chrome");
		lanchUrl("https://adactinhotelapp.com/");
		maximize();
		timeOuts();
		System.out.println("before class");

	}
	@AfterClass
	private void afterclass() {
	
    System.out.println("before");
    
	}
	@BeforeMethod
	private void beforeMethod() {
		 System.out.println("test starts ....."+new Date());
		 System.out.println("before");

	}
	@AfterMethod
	private void afterMethod() {
	
		    System.out.println("test end ....."+new Date());
		System.out.println("after");


	}

	@Test
	private void test1() throws InterruptedException, Exception {
		
		LoginPageAdactin lo = new LoginPageAdactin();
		fillTextBox(lo.getTxtusername(), getdata("FrameWorkExcel", "Datas", 1, 0));
		fillTextBox(lo.getTxtpassword(), getdata("FrameWorkExcel", "Datas", 1, 1));
		btnClick(lo.getBtnlogin());
		
		selectByIndex(lo.getBtnClickLoc(), 5);
		
		selectByIndex(lo.getBtnClickHot(), 2);
	
		selectByIndex(lo.getBtnClickRoom(), 2);
		
		selectByIndex(lo.getBtnClickNos(), 2);
		
		lo.getBtnClickDateIn().clear();
		fillTextBox(lo.getBtnClickDateIn(), getdata("FrameWorkExcel", "Datas", 1, 2));
		
	    lo.getBtnClickDateOut().clear();
	    fillTextBox(lo.getBtnClickDateOut(), getdata("FrameWorkExcel", "Datas", 1, 3));
	    
	     selectByIndex(lo.getBtnClickAdult(), 2);
	   
	    selectByIndex(lo.getBtnClickChild(), 1);
	    
	    //btnClick(lo.getBtnClickSearch());
	    btnClick(lo.getBtnClickSea());
	    
	    btnClick(lo.getBtnClickRad());
	    
	    btnClick(lo.getBtnClickCon());
	    
	    fillTextBox(lo.getTxtNameFirst(), getdata("FrameWorkExcel", "Datas", 1, 4));
	    
	    fillTextBox(lo.getTxtNameLast(), getdata("FrameWorkExcel", "Datas", 1, 5));
	    
	    fillTextBox(lo.getTxtAddress(), getdata("FrameWorkExcel", "Datas", 1, 6) );
	    
	    fillTextBox(lo.getTxtCard(), getdata("FrameWorkExcel", "Datas", 1, 7));
	    
	    selectByIndex(lo.getTxtCardType(), 2);
	    
	    selectByIndex(lo.getBtnClickMonth(), 1);
	    
	    selectByIndex(lo.getBtnClickYear(), 12);
	    
	    fillTextBox(lo.getTxtcvv1(), getdata("FrameWorkExcel", "Datas", 1, 8));
	    
	    btnClick(lo.getBtnClickBook());
	    
	    String st = lo.getTxtOrder().getAttribute("value");
	    System.out.println("get id no is-------"+st);
	 
	  getCellCreate("FrameWorkExcel", "Datas", 1, 11, st);
	  System.out.println("---------------");
	  
	   btnClick(lo.getBtnClickLtin());
	     
	   WebElement table = driver.findElement(By.xpath(("//table[@cellspacing='1']")));
//////	         String text = table.getText();
//////	         System.out.println(text);
	   List<WebElement> tablerows = table.findElements(By.tagName("tr"));
	   int size = tablerows.size();
	             System.out.println(size);
	  for (int i = 0; i < tablerows.size(); i++) {
		  WebElement eachrow = tablerows.get(i);
		  List<WebElement> tableDatas = eachrow.findElements(By.tagName("td"));
		for (int j = 0; j < tableDatas.size(); j++) {
			String datatext = tableDatas.get(j).getText();
			if(datatext.equals(st)) {
				//eachrow.findElement(By.tagName("td")).click();
				driver.findElement(By.xpath("//table[@cellspacing='1']//tr//td[1]//input")).click();
	   break;
			}
			
			
		}
	}  
	  // driver.findElement(By.xpath("//table[@cellspacing='1']//tr//td[1]//input")).click(); 
	  
//	   WebElement table = driver.findElement(By.xpath(("//table[@cellspacing='1']")));
//////   String text = table.getText();
//////   System.out.println(text);
//List<WebElement> tablerows = table.findElements(By.tagName("tr"));
//int size = tablerows.size();
//       System.out.println(size);
//       String order="";
//for (int i = 0; i < tablerows.size(); i++) {
//WebElement eachrow = tablerows.get(i);
//WebElement datatext = eachrow.findElement(By.xpath("//table[@cellspacing='1']//tr//td[2]//input"));
// order = datatext.getAttribute("value");
//	if(datatext.equals(st)) {
//		
//		eachrow.findElement(By.xpath("//table[@cellspacing='1']//tr//td[1]//input")).click();
//break;
//	}
//	System.out.println("----------------");
//	System.out.println("cancel"+order);
//	driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
//}
//}	   
//	   
//	   
	   
	   
	   
	   
	   
	   
	   
//	   String input = st;
//	   WebElement table = driver.findElement(By.xpath("//form[@id='booked_form']//tbody/tr[2]/td/table"));
//      String text = table.getText();
//       System.out.println(text);
//       
// List<WebElement> tablerows = table.findElements(By.xpath("./tbody/tr"));
// int size = tablerows.size();
//	             System.out.println(size);
//	             String order = "";
//             
//	             for (int i = 0; i < tablerows.size(); i++) {
//	       		  WebElement eachrow = tablerows.get(i);
//	     WebElement datas = eachrow.findElement(By.xpath("./td[2]/input"));
//	      order = datas.getAttribute("value");
//	       		
//	       			if(datas.equals(input)) {
//	       				eachrow.findElement(By.xpath("./td[1]/input")).click();
//	       				break;
//	       			}
//	       			System.out.println("cancel"+order);
//	       			driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();		
//	       			
//	       		
//      	}                
//	             
	             
	             
	             
	             
	             
	             
	}}
	


