package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Shopping {


	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement dress;
	@FindBy(id = "layered_id_attribute_group_2")
	private WebElement size;
	@FindBy(id = "layered_id_feature_5")
	private WebElement material;
	@FindBy(xpath = "//div[@class='left-block']")
	private WebElement view;
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement add_to_cart;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	

	public Dress_Shopping (WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getMaterial() {
		return material;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}
	public WebElement getCheckout() {
		return checkout;
	}


}
