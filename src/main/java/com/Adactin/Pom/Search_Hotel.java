package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	
	@FindBy(id = "hotels")
	private WebElement hotelname;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(className = "search_combobox")
	private WebElement no_of_rooms;
	@FindBy(name = "datepick_in")
	private WebElement check_in;
	@FindBy(name = "datepick_out")
	private WebElement check_out;
	@FindBy(id = "adult_room")
	private WebElement adults_per_room;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "Submit")
	private WebElement search;

	public Search_Hotel (WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdults_per_room() {
		return adults_per_room;
	}

	public WebElement getSearch() {
		return search;
	}



}
