package com.Automation.Pom;

import org.openqa.selenium.WebDriver;

public class Automation_Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;
	private Signin_Page sn;
	private Dress_Shopping ds;
	private Summary_Page sum;
	private Billing_Address ba;
	private Shipping delivery;
	private Payment_Page pa;

	public Automation_Page_Object_Manager(WebDriver driver1) {
		this.driver = driver1;
	}

	public Home_Page getHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}

	public Signin_Page getSn() {
		if (sn == null) {
			sn = new Signin_Page(driver);
		}
		return sn;
	}

	public Dress_Shopping getDs() {
		if (ds == null) {
			ds = new Dress_Shopping(driver);
		}
		return ds;
	}

	public Summary_Page getSum() {
		if (sum == null) {
			sum = new Summary_Page(driver);
		}
		return sum;
	}

	public Billing_Address getBa() {
		if (ba == null) {
			ba = new Billing_Address(driver);
		}
		return ba;
	}

	public Shipping getDelivery() {
		if (delivery == null) {
			delivery = new Shipping(driver);
		}
		return delivery;
	}

	public Payment_Page getPa() {
		if (pa == null) {
			pa = new Payment_Page(driver);
		}
		return pa;
	}

}
