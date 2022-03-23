package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement Username;

	@FindBy(id = "password")
	private WebElement Password;

	@FindBy(id = "login")
	private WebElement Login_Btn;

	public Home_Page(WebDriver driver1) {
		this.driver = driver1;

		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin_Btn() {
		return Login_Btn;
	}

}
