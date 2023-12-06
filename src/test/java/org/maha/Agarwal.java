package org.maha;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.poms.UserRegistraction;
import org.testng.annotations.Test;

public class Agarwal extends Base {

	@Test
	private void test() throws InterruptedException{
		
		lanchBrowser("chrome");
		lanchUrl("https://www.agarwalmatrimony.com");
		maximize();
		timeOuts();
		WebElement btnMatrimonyProfile = driver.findElement(By.xpath("//span[text()='Select Profile']"));
		btnMatrimonyProfile.click();
		WebElement bhnSon = driver.findElement(By.xpath("(//li[@role='radio'])[3]"));
		bhnSon.click();
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("Ajeesh");
		WebElement txtMobileNumber = driver.findElement(By.id("mobileNo"));
		txtMobileNumber.sendKeys("9876543210");
		WebElement btnRegister = driver.findElement(By.xpath("//button[text()='Register Free']"));
		btnRegister.click();
		
		WebElement btnDate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		btnDate.click();
		WebElement btnDateOfBrith = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[9]"));
		btnDateOfBrith.click();
		WebElement btnReligion = driver.findElement(By.id("select2-religion-container"));
		btnReligion.click();
		WebElement btnHindu = driver.findElement(By.xpath("//li[@title='Hindu']"));
		btnHindu.click();
		WebElement btnSubCasteSelect = driver.findElement(By.id("select2-subCaste-container"));
		btnSubCasteSelect.click();
		WebElement btnSubCaste = driver.findElement(By.xpath("(//*[@class='select2-results__option'])[4]"));
		btnSubCaste.click();
		WebElement btnMotherTongue = driver.findElement(By.id("select2-motherTongue-container"));
		btnMotherTongue.click();
		WebElement btnHindi = driver.findElement(By.xpath("//li[text()='Hindi']"));
		btnHindi.click();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("aje1234@gmail.com");
		WebElement btnPassword = driver.findElement(By.id("password"));
		btnPassword.sendKeys("12345678");
		WebElement btnContinue = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		btnContinue.click();
		
		WebElement btnStar = driver.findElement(By.id("select2-star-container"));
		btnStar.click();
		WebElement btnAswini = driver.findElement(By.xpath("//li[text()='Aswini']"));
		btnAswini.click();
		WebElement btnRaasi = driver.findElement(By.id("select2-raasi-container"));
		btnRaasi.click();
		WebElement btnDhanu = driver.findElement(By.xpath("//li[text()='Dhanu (Sagittarius)']"));
		btnDhanu.click();
		WebElement btnGothra = driver.findElement(By.id("gothramText"));
		btnGothra.click();
		WebElement btnManglik = driver.findElement(By.xpath("//label[text()=' Yes']"));
		btnManglik.click();
		WebElement btnKethuDosh = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		btnKethuDosh.click();
		WebElement btnHours = driver.findElement(By.id("select2-hours-container"));
		btnHours.click();
		WebElement btnOne = driver.findElement(By.xpath("//li[text()='1']"));
		btnOne.click();
		WebElement btnMeridiem = driver.findElement(By.id("select2-meridiem-container"));
		btnMeridiem.click();
		WebElement btnAm = driver.findElement(By.xpath("//li[text()='AM']"));
		btnAm.click();
		WebElement btnCountry = driver.findElement(By.id("select2-birth_country-container"));
		btnCountry.click();
		WebElement btnAlgeria = driver.findElement(By.xpath("(//li[@role='treeitem'])[2]"));
		btnAlgeria.click();
		WebElement btnState = driver.findElement(By.id("select2-birth_state-container"));
		btnState.click();
		WebElement btnAllReligion = driver.findElement(By.xpath("//li[text()='All Regions']"));
		btnAllReligion.click();
		WebElement btnCity = driver.findElement(By.id("select2-birth_city-container"));
		btnCity.click();
		WebElement btnAinelHadjel = driver.findElement(By.xpath("//li[text()='Ain el Hadjel']"));
		btnAinelHadjel.click();
		WebElement btnContinue1 = driver.findElement(By.xpath("//a[text()='Continue']"));
		btnContinue1.click();
		
		WebElement btnMaritalStatus = driver.findElement(By.id("mStatus1"));
		btnMaritalStatus.click();
		WebElement btnHeight = driver.findElement(By.id("select2-heightFeet-container"));
		btnHeight.click();
		WebElement btnFeet = driver.findElement(By.xpath("//li[text()='4 feet']"));
		btnFeet.click();
		WebElement btnMiddleClass = driver.findElement(By.id("familyStatuss1"));
		btnMiddleClass.click();
		WebElement btnJoinFamily = driver.findElement(By.id("familyTypes1"));
		btnJoinFamily.click();
		WebElement btnPhysicalStatus = driver.findElement(By.id("physicalStatuss0"));
		btnPhysicalStatus.click();
		WebElement btnContinue2 = driver.findElement(By.xpath("//a[text()='Continue']"));
		btnContinue2.click();
		
		WebElement btnHighestEduction = driver.findElement(By.id("select2-educationCategory-container"));
		btnHighestEduction.click();
		WebElement btnPHD = driver.findElement(By.xpath("//li[text()='Ph.D.']"));
		btnPHD.click();
		WebElement btnAdditionalDegree = driver.findElement(By.id("select2-educationadditional-container"));
		btnAdditionalDegree.click();
		WebElement btnDM = driver.findElement(By.xpath("//li[text()='DM']"));
		btnDM.click();
		WebElement btnEmployedIn = driver.findElement(By.id("employmentCategorys3"));
		btnEmployedIn.click();
		WebElement btnOccupation = driver.findElement(By.id("select2-occupation-container"));
		btnOccupation.click();
		WebElement btnOfficer = driver.findElement(By.xpath("//li[text()='Officer']"));
		btnOfficer.click();
		WebElement btnIncome = driver.findElement(By.id("select2-annualIncome-container"));
		btnIncome.click();
		WebElement btnLakhs = driver.findElement(By.xpath("//li[text()='4 - 5 Lakhs']"));
		btnLakhs.click();
		WebElement btnResidingState = driver.findElement(By.id("select2-residingState-container"));
		btnResidingState.click();
		WebElement btnAndaman = driver.findElement(By.xpath("//li[text()='Andaman & Nicobar']"));
		btnAndaman.click();
		WebElement btnResidingCity = driver.findElement(By.id("select2-residingCityId-container"));
		btnResidingCity.click();
		WebElement btnBombooflat = driver.findElement(By.xpath("//li[text()='Bombooflat']"));
		btnBombooflat.click();
		WebElement btnContinue3 = driver.findElement(By.xpath("//a[text()='Continue']"));
		btnContinue3.click();
		
		WebElement btnCompleteRegistration = driver.findElement(By.xpath("//a[text()='COMPLETE REGISTRATION']"));
		btnCompleteRegistration.click();
		
		
		
		
		
	}
}
