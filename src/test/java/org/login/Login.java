package org.login;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
	public  Login() {
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtSearch;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement btnClick;
	
	@FindBys({@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")})
	private List<WebElement> txtPones;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public List<WebElement> getTxtPones() {
		return txtPones;
	}
	
	
	
	
	
	
	

}
