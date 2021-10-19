package org.login;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdactin extends Base {
	public LoginPageAdactin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement txtusername;
	
	@FindBy(id = "password")
	private WebElement txtpassword;
	
	@FindBy(id = "login")
	private WebElement btnlogin;
	
	@FindBy(id = "location")
	private WebElement btnClickLoc;
	
	@FindBy(id = "hotels")
	private WebElement btnClickHot;
	
	@FindBy(id = "room_type")
	private WebElement btnClickRoom;
	
	@FindBy(id = "room_nos")
	private WebElement btnClickNos;
	
	@FindBy(id = "datepick_in")
	private WebElement btnClickDateIn;
	
	@FindBy(id = "datepick_out")
	private WebElement btnClickDateOut;
	
	@FindBy(id = "adult_room")
	private WebElement btnClickAdult;
	
	@FindBy(id = "child_room")
	private WebElement btnClickChild;
	
	@FindBy(id = "submit")
	private WebElement btnClickSearch;
	
	@FindBy(xpath = "//input[@type = 'radio']")
	private WebElement btnClickRad;
	
	@FindBy(id = "continue")
	private WebElement btnClickCon;
	
	@FindBy(id = "first_name")
	private WebElement txtNameFirst;
	
	@FindBy(id = "last_name")
	private WebElement txtNameLast;
	
	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num")
	private WebElement txtCard;
	
	@FindBy(id = "cc_type")
	private WebElement txtCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement btnClickMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement btnClickYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement txtcvv;
	
	@FindBy(id = "order_no")
	private WebElement txtOrder;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getBtnClickLoc() {
		return btnClickLoc;
	}

	public WebElement getBtnClickHot() {
		return btnClickHot;
	}

	public WebElement getBtnClickRoom() {
		return btnClickRoom;
	}

	public WebElement getBtnClickNos() {
		return btnClickNos;
	}

	public WebElement getBtnClickDateIn() {
		return btnClickDateIn;
	}

	public WebElement getBtnClickDateOut() {
		return btnClickDateOut;
	}

	public WebElement getBtnClickAdult() {
		return btnClickAdult;
	}

	public WebElement getBtnClickChild() {
		return btnClickChild;
	}

	public WebElement getBtnClickSearch() {
		return btnClickSearch;
	}

	public WebElement getBtnClickRad() {
		return btnClickRad;
	}

	public WebElement getBtnClickCon() {
		return btnClickCon;
	}

	public WebElement getTxtNameFirst() {
		return txtNameFirst;
	}

	public WebElement getTxtNameLast() {
		return txtNameLast;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCard() {
		return txtCard;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getBtnClickMonth() {
		return btnClickMonth;
	}

	public WebElement getBtnClickYear() {
		return btnClickYear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getTxtOrder() {
		return txtOrder;
	}
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnClickSea;

	public WebElement getBtnClickSea() {
		return btnClickSea;
	}
	
	@FindBy(xpath = "(//input[@type = 'text'])[14]")
	private WebElement txtcvv1;

	public WebElement getTxtcvv1() {
		return txtcvv1;
	}
	@FindBy(id = "book_now")
	private WebElement btnClickBook;

	public WebElement getBtnClickBook() {
		return btnClickBook;
	}
	
	@FindBy(id="my_itinerary")
	private WebElement btnClickLtin;
	
	@FindBy(xpath="//table[@cellspacing='1']")
	private WebElement btnClickTable;

	public WebElement getBtnClickLtin() {
		return btnClickLtin;
	}

	public WebElement getBtnClickTable() {
		return btnClickTable;
	}
	
	
	
	
	
	
	
	

}
