package org.loginPage;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logins extends Base {

	public Logins() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Not Now']")
	private WebElement btnClickNot;
	
	@FindBy(xpath = "//span[text()='Chennai']")
	private WebElement btnClickche;
	
	@FindBy(xpath = "//div[text()='Venom: Let There Be Carnage']")
	private WebElement btnClickvenom;
	
	@FindBy(xpath = "(//span[text()='Book tickets'])[1]")
	private WebElement btnClickBook;
	
	@FindBy(xpath = "(//span[text()='3D'])[1]" )
	private WebElement btnClick3D;
	
	@FindBy(xpath = "(//div[@class='__text'])[9]")
	private WebElement btnClickTime;
	
	@FindBy(xpath = "//li[text()='4']")
	private WebElement btnClickcar;
	
	@FindBy(id = "proceed-Qty")
	private WebElement btnClickSeat;

	public WebElement getBtnClickNot() {
		return btnClickNot;
	}

	public WebElement getBtnClickche() {
		return btnClickche;
	}

	public WebElement getBtnClickvenom() {
		return btnClickvenom;
	}

	public WebElement getBtnClickBook() {
		return btnClickBook;
	}

	public WebElement getBtnClick3D() {
		return btnClick3D;
	}

	public WebElement getBtnClickTime() {
		return btnClickTime;
	}

	public WebElement getBtnClickcar() {
		return btnClickcar;
		
	}

	public WebElement getBtnClickSeat() {
		return btnClickSeat;
	}
	@FindBy(xpath = "//div[text()='Accept']")
	private WebElement btnClickAccept;

	public WebElement getBtnClickAccept() {
		return btnClickAccept;
	}
	@FindBy(xpath = "(//div[@class='styles__DimensionComponent-sc-vhz3gb-3 eQxBjq'])[3]")
	private WebElement btnClick3D1;

	public WebElement getBtnClick3D1() {
		return btnClick3D1;
	}
	@FindBy(xpath = "(//a[@class='date-href'])[2]")
	private WebElement btnClick31;

	public WebElement getBtnClick30() {
		return btnClick31;
	}
	
	@FindBy(xpath  = "(//a[@class='_available'])[1]")
	private WebElement btnClickSeat1;
	
	@FindBy(xpath = "(//a[@class='_available'])[2]")
	private WebElement btnClickSeat2;
	
	@FindBy(xpath = "(//a[@class='_available'])[3]")
	private WebElement btnClickSeat3;
	
	@FindBy(xpath = "(//a[@class='_available'])[4]")
	private WebElement btnClickSeat4;

	public WebElement getBtnClick31() {
		return btnClick31;
	}

	public WebElement getBtnClickSeat1() {
		return btnClickSeat1;
	}

	public WebElement getBtnClickSeat2() {
		return btnClickSeat2;
	}

	public WebElement getBtnClickSeat3() {
		return btnClickSeat3;
	}

	public WebElement getBtnClickSeat4() {
		return btnClickSeat4;
	}
	
	@FindBy(xpath = "(//a[@id='btmcntbook'])[1]")
	private WebElement btnClickPay;
	
	@FindBy(id = "prePay")
	private WebElement btnClickProceed;

	public WebElement getBtnClickPay() {
		return btnClickPay;
	}

	public WebElement getBtnClickProceed() {
		return btnClickProceed;
	}	
	
	
	
	
	
	
	
}
