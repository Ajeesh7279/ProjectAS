package org.excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelToDataProvider {

	public static Object[][] test1() throws IOException {
		File loc = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\FrameWorkTestNg\\src\\test\\resources\\Excel\\ExcelToData.xlsx");
		FileInputStream fs = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fs);
		Sheet sh = w.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		int cellCount = r.getPhysicalNumberOfCells();
		Object[][] obj = new Object[rowCount - 1][cellCount];
		for (int i = 0; i < rowCount - 1; i++) {
			Row row = sh.getRow(i + 1);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				// System.out.println(cell);
				int type = cell.getCellType();
				// System.out.println(type);

				String value = null;
				if (type == 1) {
					value = cell.getStringCellValue();
//					System.out.println(Value);
				} else {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat();
						value = sd.format(date);
					} else {
						double num = cell.getNumericCellValue();
						long ln = (long) num;
						value = String.valueOf(ln);
//						System.out.println(value);
					}
				}
				obj[i][j] = value;
			}

		}
		return obj;

	}

//public static void main(String[] args) throws IOException {
//	
//	Object[][] test1 = test1();
//	for (Object[] x : test1) {
//		for (Object y : x) {
//			System.out.println(y);
//		}
//}
	@DataProvider(name = "login",indices= {1,3})
	private Object[][] data() throws IOException {
		Object[][] test1 = test1();
		return test1;

	}@Test(dataProvider="login")
	private void raj(String user , String pass) {
	
System.out.println(user);
System.out.println(pass);
	
	}
}