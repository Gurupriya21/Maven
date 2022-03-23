package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Summary_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary_Checkout;

	public Summary_Page(WebDriver driver1) {
		this.driver = driver1;

	}

	public WebElement getSummary_Checkout() {
		return summary_Checkout;
	}

}
