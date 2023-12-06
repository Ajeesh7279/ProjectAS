package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Ajeesh\\it\\Eclipise Workspace\\FrameWorkTestNg\\src\\test\\resources\\Excel\\datafile.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet sh = w.getSheet("datafile");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		//System.out.println(cell);
		
//		int rowCount = sh.getPhysicalNumberOfRows();
//		int cellCount = row.getPhysicalNumberOfCells();
		
		int type = cell.getCellType();
		if(type==1){
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else{
			double db = cell.getNumericCellValue();
			long l = (long)db;
			String value = String.valueOf(l);
			System.out.println(value);
			
		}
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell ce = r.getCell(j);
				
				if(type==1){
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else{
					double db = cell.getNumericCellValue();
					long l = (long)db;
					String value = String.valueOf(l);
					//System.out.println(value);
					
				}
				
				System.out.println(ce);	
			}
			System.out.println();
		}
//			
//		
		
		
	}

}
