package org.adactin;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdactinReg extends Base {
	
	public LoginPageAdactinReg() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New User ')]")
	private WebElement btnlickNew;
	
	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(id = "password")
	private WebElement txtpassword;
	
	@FindBy(name = "re_password")
    private WebElement txtrepassword;
	
	@FindBy(name = "full_name")
	private WebElement txtFullName;
	
	@FindBy(name = "email_add")
	private WebElement txtmail;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement btnCheckbox;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement btnSubmit;

	public WebElement getBtnlickNew() {
		return btnlickNew;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getTxtrepassword() {
		return txtrepassword;
	}

	public WebElement getTxtFullName() {
		return txtFullName;
	}

	public WebElement getTxtmail() {
		return txtmail;
	}

	public WebElement getBtnCheckbox() {
		return btnCheckbox;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
