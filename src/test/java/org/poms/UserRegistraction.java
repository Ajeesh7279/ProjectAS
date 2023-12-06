package org.poms;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistraction extends Base {
	
	public UserRegistraction() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement btnSignIN;
	
	@FindBy(id="email_create")
	private WebElement txtEmailAddress;
	
	@FindBy(id="SubmitCreate")
	private WebElement bthCreateAccount;
		
	@FindBy(id="id_gender2")
	private WebElement btnRadio;
	
	@FindBy(id="customer_firstname")
	private WebElement txtFirstName;
	
	@FindBy(id="customer_lastname")
	private WebElement txtlastName;
	
	@FindBy(id="passwd")
	private WebElement txtpassword;
	
	@FindBy(id="days")
	private WebElement btnDays;
	
	@FindBy(id="months")
	private WebElement btMonths;
	
	@FindBy(id="years")
	private WebElement txtYears;
	
	@FindBy(id="company")
	private WebElement txtCompany;
	
	@FindBy(id="address1")
	private WebElement txtAddress1;
	
	@FindBy(id="address2")
	private WebElement txtAddress2;
	
	@FindBy(id="city")
	private WebElement txtCity;
	
	@FindBy(id="id_state")
	private WebElement txtState;
	
	@FindBy(id="postcode")
	private WebElement txtPostcode;
	
	@FindBy(id="other")
	private WebElement txtAddInformation;
	
	@FindBy(id="phone")
	private WebElement txtHomePhone;
	
	@FindBy(id="phone_mobile")
	private WebElement txtMobilePhone;
	
	@FindBy(xpath="//span[text()='Register']")
	private WebElement btnRegister;

	public WebElement getBtnSignIN() {
		return btnSignIN;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public WebElement getBthCreateAccount() {
		return bthCreateAccount;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtastName() {
		return txtlastName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnDays() {
		return btnDays;
	}

	public WebElement getBtMonths() {
		return btMonths;
	}

	public WebElement getTxtYears() {
		return txtYears;
	}

	public WebElement getTxtCompany() {
		return txtCompany;
	}

	public WebElement getTxtAddress1() {
		return txtAddress1;
	}

	public WebElement getTxtAddress2() {
		return txtAddress2;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtPostcode() {
		return txtPostcode;
	}

	public WebElement getTxtAddInformation() {
		return txtAddInformation;
	}

	public WebElement getTxtHomePhone() {
		return txtHomePhone;
	}

	public WebElement getTxtMobilePhone() {
		return txtMobilePhone;
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
