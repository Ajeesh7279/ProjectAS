package org.flipcart;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlip extends Base{
    public LoginFlip() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnCancel;
	
	@FindBy(name = "q")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath= "//div[contains(text(),'APPLE iPhone 12 (Black')]")
	private WebElement btnClick;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement btnCart;
	
	@FindBy(xpath = "//a[text()='Help Center']")
	private WebElement btnHelp;
	
	@FindBy(xpath = "//span[text()='Baby & Kids']")
	private WebElement btnBabyKids;
	
	@FindBy(xpath = "(//a[@class='_3QN6WI'])[20]")
	private WebElement btnKid;
	
	@FindBy(xpath = "(//img[@class='_2r_T1I'])[3]")
	private WebElement btnWatch;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement btnCartWatch;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement btnOrder;

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getBtnCart() {
		return btnCart;
	}

	public WebElement getBtnHelp() {
		return btnHelp;
	}

	public WebElement getBtnBabyKids() {
		return btnBabyKids;
	}

	public WebElement getBtnKid() {
		return btnKid;
	}

	public WebElement getBtnWatch() {
		return btnWatch;
	}

	public WebElement getBtnCartWatch() {
		return btnCartWatch;
	}

	public WebElement getBtnOrder() {
		return btnOrder;
	}
	
	
	
}
