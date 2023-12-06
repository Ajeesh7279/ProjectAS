package org.poms;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelection extends Base {
	
	public ProductSelection() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='T-shirts']")
	private WebElement btnTShirt;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	private WebElement btnProceedToCheckout;

}
