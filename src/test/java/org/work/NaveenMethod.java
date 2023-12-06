package org.work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class NaveenMethod {
	
	static WebDriver driver;

	public static void chrome() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

	}

public static void items(String allItems) {
	String st="all";
	List<WebElement> txtItems = driver.findElements(By.xpath("//span[@class='filter-display-name']"));
for (int i = 0; i < txtItems.size(); i++) {
	WebElement webItems = txtItems.get(i);
	String strItems = webItems.getText();
	if(strItems.equals(allItems)){
		webItems.click();
}
if(st.equals(allItems)){
	System.out.println(strItems);

	webItems.click();
}}}



public static void items(String allItems,String allItems1) {
	List<WebElement> txtItems = driver.findElements(By.xpath("//span[@class='filter-display-name']"));
for (int i = 0; i < txtItems.size(); i++) {
	WebElement webItems = txtItems.get(i);
	String strItems = webItems.getText();
	System.out.println(strItems);
	if(strItems.equals(allItems)){
		webItems.click();
}else if(strItems.equals(allItems1)){
		webItems.click();
}}}

public static void items(String allItems,String allItems1, String allItems2) {
	List<WebElement> txtItems = driver.findElements(By.xpath("//span[@class='filter-display-name']"));
for (int i = 0; i < txtItems.size(); i++) {
	WebElement webItems = txtItems.get(i);
	String strItems = webItems.getText();
	System.out.println(strItems);
	if(strItems.equals(allItems)){
		webItems.click();
}else if(strItems.equals(allItems1)){
		webItems.click();
}else if(strItems.equals(allItems2)){
		webItems.click();
}}}

// one item select
 public static void selectFilter(String filte,String allItems){
		  List<WebElement> filters = driver.findElements(By.xpath("//legend[@class='fx-flex']"));
		  for (int i = 0; i < filters.size(); i++) {
			  WebElement web = filters.get(i);
			  String str = web.getText();
			  if(str.equals(filte)){
				  web.click();
				  items(allItems);
			  }}}
	
//Three item select
public static void selectFilter(String filte,String allItems,String allItems1,String allItems2){
  List<WebElement> filters = driver.findElements(By.xpath("//legend[@class='fx-flex']"));
  for (int i = 0; i < filters.size(); i++) {
	  WebElement web = filters.get(i);
	  String str = web.getText();
	  if(str.equals(filte)){
		  web.click();
		  items(allItems,allItems1,allItems2);
	  }}}

// Two item select
public static void selectFilter(String filte,String allItems,String allItems1){
  List<WebElement> filters = driver.findElements(By.xpath("//legend[@class='fx-flex']"));
  for (int i = 0; i < filters.size(); i++) {
	  WebElement web = filters.get(i);
	  String str = web.getText();
	  if(str.equals(filte)){
		  web.click();
		  items(allItems,allItems1);
	  }}}


}
