package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {


	public WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement check_box;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Shipping_checkout;

	public Shipping(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCheck_box() {
		return check_box;
	}

	public WebElement getShipping_checkout() {
		return Shipping_checkout;
	}





}
