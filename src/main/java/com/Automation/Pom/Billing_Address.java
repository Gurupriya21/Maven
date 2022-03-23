package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Address {




	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Address_checkout;

	public Billing_Address(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getAddress_checkout() {
		return Address_checkout;
	}


	
	
	




}
