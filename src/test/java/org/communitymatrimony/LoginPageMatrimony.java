package org.communitymatrimony;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMatrimony extends Base {
	public LoginPageMatrimony() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "idEmail")
	private WebElement txtUserId;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "frmsubmit")
	private WebElement btnLogin;
	 
	@FindAll({@FindBy(xpath = "//a[text()='Skip to Daily Matches >>  ']"),@FindBy(xpath = "//a[@class='clr7']")})
	private WebElement btnSkip;
	
	@FindBy(xpath = "//img[@alt='close']")
	private WebElement btnClose;
	
	@FindBy(xpath = "((//a[text()='Upgrade']))[1]")
	private WebElement btnUpgrade;
	
	@FindBy(xpath = "((//a[text()='Pay Now']))[1]")
	private WebElement btnPay;
	
	@FindBy(id = "vpc_CardNum_C")
	private WebElement txtCardNo;
	
	@FindBy(id = "cardExpiryMonth_C")
	private WebElement txtExpiryMonth;
	
	@FindBy(name = "cardExpiryYear")
	private WebElement txtExpireYear;
	
	@FindBy(id = "vpc_CardSecurityCode_C")
	private WebElement txtCvv;
	
	@FindBy(id = "creditButton")
	private WebElement btnPaySecurely;
	
	public WebElement getTxtUserId() {
		return txtUserId;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnSkip() {
		return btnSkip;
	}

	public WebElement getBtnClose() {
		return btnClose;
	}

	public WebElement getBtnUpgrade() {
		return btnUpgrade;
	}

	public WebElement getBtnPay() {
		return btnPay;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtExpiryMonth() {
		return txtExpiryMonth;
	}

	public WebElement getTxtExpireYear() {
		return txtExpireYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnPaySecurely() {
		return btnPaySecurely;
	}

	

}
