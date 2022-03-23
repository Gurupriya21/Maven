package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {


	public WebDriver driver;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement order_confirm;

	public Payment_Page(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getOrder_confirm() {
		return order_confirm;
	}





}
