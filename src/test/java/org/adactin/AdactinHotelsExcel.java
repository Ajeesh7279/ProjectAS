package org.adactin;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Base;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AdactinHotelsExcel extends Base {
	
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
	
    System.out.println("after class");
    
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
	  
	  SoftAssert s = new SoftAssert();
	  s.assertAll();
	    
//	    File f = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkTestNg\\src\\test\\resources\\Excel\\FrameWorkExcel.xlsx");
//	    FileInputStream st1 = new FileInputStream(f);
//	    Workbook w = new XSSFWorkbook(st1);
//	    Sheet sheet = w.getSheet("Datas");
//	     Row row = sheet.getRow(0);
//	     Cell cell = row.createCell(0);
//	     cell.setCellValue("ajeesh");
////	     if(value.equals("123")) {
////	    	 cell.setCellValue("122345");
////	     }
//	     
//	     System.out.println("--------"+cell);
//	     FileOutputStream ot = new FileOutputStream(f);
//	     w.write(ot);
//	     System.out.println("---------");
	     
	     
	     
	
	}	
	

}
