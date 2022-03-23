package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radio_Btn;
	@FindBy(id = "continue")
	private WebElement cont;

	public Select_Hotel (WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getCont() {
		return cont;
	}



}
