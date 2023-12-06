package org.poms;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends Base {
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='bankwire']")
	private WebElement btnBankWire;
	
	@FindBy(xpath="(//*[@type='submit'])[2]")
	private WebElement btnConformMyOrder;
	
	@FindBy(xpath="//*[text()='Your order on My Store is complete.']")
	private WebElement btnttVerify;

}
