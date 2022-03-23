package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_Adactin {

	public WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	public Orders_Adactin(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getItinerary() {
		return itinerary;
	}

}
