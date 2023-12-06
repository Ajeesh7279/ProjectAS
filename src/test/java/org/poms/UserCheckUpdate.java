package org.poms;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCheckUpdate extends Base {
	
	public UserCheckUpdate() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@title='Proceed to checkout']")
	private WebElement btnProceedToCheckout1;
	
	@FindBy(xpath="(//*[@type='submit'])[2]")
	private WebElement btnProceedToCheckout2;
	
	@FindBy(id="cgv")
	private WebElement btnCheckBox;
	
	@FindBy(xpath="(//*[@type='submit'])[2]")
	private WebElement btnProceedToCheckout3;
			
			
			
			
			
}
