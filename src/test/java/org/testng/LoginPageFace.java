package org.testng;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFace extends Base {
	public LoginPageFace() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "email")
	private WebElement txtUsername;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
