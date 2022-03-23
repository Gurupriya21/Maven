package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Hotel {
	
	private WebDriver driver;
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement credit_card_no;
	@FindBy(id="cc_type")
	private WebElement credit_card_type;
	@FindBy(id="cc_exp_month")
	private WebElement expmnt;
	@FindBy(id="cc_exp_year")
	private WebElement expyr;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	
	public Booking_Hotel (WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit_card_no() {
		return credit_card_no;
	}
	public WebElement getCredit_card_type() {
		return credit_card_type;
	}
	public WebElement getExpmnt() {
		return expmnt;
	}
	public WebElement getExpyr() {
		return expyr;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	





	
}
