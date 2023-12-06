package org.communitymatrimony;

import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
    
public class Base {
	public static WebDriver driver;
	
public static WebDriver lanchBrowser(String browsername) {
	WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	return driver;

}
	public static void lanchUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void timeOuts() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();

	}
	public static  void fillTextBox(WebElement e , String value) {
		e.sendKeys(value);
	}
	public static List<WebElement> findElements(String name) {
		return driver.findElements(By.xpath(name));
	}
	public static void btnClick(WebElement e) {
		e.click();

	}
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	public static String getAttributeInner(WebElement et) {
		return et.getAttribute("innerText");
	}
	
	public static String getAttribute(WebElement e) {
	     return e.getAttribute("value");

	}
	public static void moveToElement(WebElement target) {
	Actions a = new Actions(driver);
        a.moveToElement(target).perform();
	}
	public static void dragAndDrop(WebElement src , WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}
	public static void contextClick(WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}
	public static void doubleClick(WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
		
	}
	public static void btnClickTarget(WebElement target) {
		Actions a = new Actions(driver);
		a.click(target).perform();

	}
	public static void selectByIndex(WebElement e , int index) {
		Select s = new Select(e);
             s.selectByIndex(index);
	}
	public static void selectByValue(WebElement e , String value) {
		Select s = new Select(e);
		s.selectByValue(value);

	}
	public static void selectByVisibleText(WebElement e , String text ) {
    	Select s = new Select(e);
		s.selectByVisibleText(text);

	}
	public static void screenshot( File des) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, des);
	}
	public static void screenshotTime( String des) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\screenshots\\"+des+".png");
		FileUtils.copyFile(src1, des1);

	}
	public static void jsFillTextBox( String value,String filltext ,WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','filltext')", e);
	
	}
	public static String jsgetAttribute( String value, Object e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].getAttribute('value')", e);
		return value;
	
	}
	public static void jsclick(String value,WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);

	}
	public static void jsScrollDown( String Down , WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollInToView(true)", e);
	
	}
	public static void jsScrollUp( String up , WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollInToView(false)", e);
	
	}
	public static void navigateLanchUrl(String url) {
		driver.navigate().to(url);

	}
	public static void navigateBack() {
		driver.navigate().back();

	}
	public static void navigateForward() {
	driver.navigate().forward();

	}
	public static void navigateRefresh() {
		driver.navigate().refresh();

	}
	public static Set<String> windowHandles() {
		
		Set<String> se1 = driver.getWindowHandles();
		return se1;
	}
//	public static void setToList(Set< String> index){
//		List<String> li = new ArrayList<String>();
//                 li.addAll(index);
//				
//	}
	public static List<String> setToList(){
		List<String> li = new ArrayList<String>();
		return li;
                 			
	}
	public static void switchToWindow(String index) {
		    driver.switchTo().window(index);

	}
	public static String getdata(String filename,String sheetname,int rowno,int cellno) throws IOException {
		File loc = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkTestNg\\src\\test\\resources\\Excel\\"+filename+".xlsx");
		
		FileInputStream st = new FileInputStream(loc);
		
		Workbook w = new XSSFWorkbook(st);
		
		Sheet sheet = w.getSheet(sheetname);
		
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		
		int type = cell.getCellType();
	
		String value = null;
		if(type==1) {
			 value = cell.getStringCellValue();
			
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
		
			 value = new SimpleDateFormat("dd-mm-yyyy").format(cell.getDateCellValue());
		
			}
			
		else {
			double db = cell.getNumericCellValue();
		
			long ln = (long)db;
			 value = String.valueOf((long)cell.getNumericCellValue());
			
		}
			
			}
		return value;

	}
	
	public static void getCellCreate(String filename,String sheetname,int rowno,int cellno,String value) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkTestNg\\src\\test\\resources\\Excel\\"+filename+".xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet sh = w.getSheet(sheetname);
		Row row = sh.getRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(value);
		
		FileOutputStream ot = new FileOutputStream(f);
		w.write(ot);
		

	}
	public static WebElement findElement(String locationname , String locator) {
		WebElement e = null;
		if(locationname.equals("id")) {
			e = driver.findElement(By.id(locator));
	}
		else if(locationname.equals("name")){
			e = driver.findElement(By.name(locator));
		}
		else if(locationname.equals("xpath")) {
	        e = driver.findElement(By.xpath(locator));
		}
		return e;
		
		
		
	}	
	}
	

	
	
	
	
	
	
	
	
	
	


