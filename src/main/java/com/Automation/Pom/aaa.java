package com.Automation.Pom;

import org.openqa.selenium.WebDriver;

public class aaa {
	
	public WebDriver driver;
	
	private  Home_Page hp;
	
	public aaa(WebDriver driver1) {
		
		this.driver = driver1;
		
	}
	

	public Home_Page get_Instance_Hp() {
		return hp;
	}
	
	
	
	
	

}
