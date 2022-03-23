package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {


	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "passwd")
	private WebElement password;
	@FindBy(id = "SubmitLogin")
	private WebElement login_Btn;

	
	
	public Signin_Page (WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin_Btn() {
		return login_Btn;
	}
	
	



}
