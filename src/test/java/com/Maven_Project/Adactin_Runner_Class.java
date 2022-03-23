package com.Maven_Project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Adactin.Pom.Adactin_Page_Object_Manager;

public class Adactin_Runner_Class extends Base_Class_Runner {
	public static WebDriver driver = browser("chrome");

	public static Adactin_Page_Object_Manager pom = new Adactin_Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Runner_Class.class);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		navigate("https://adactinhotelapp.com/");

		input_value(pom.get_Instance_Hp().getUsername(), Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 12,5));
		input_value(pom.get_Instance_Hp().getPassword(),Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 13, 5));
		Click(pom.get_Instance_Hp().getLogin_Btn());
		log.info("Login completed");
		
		dropdown("ByValue", pom.get_Instance_Sh().getHotelname(), "Hotel Sunshine");
		dropdown("ByIndex", pom.get_Instance_Sh().getRoomtype(), "2");
		dropdown("ByIndex", pom.get_Instance_Sh().getNo_of_rooms(), "0");
		Clear(pom.get_Instance_Sh().getCheck_in());
		input_value(pom.get_Instance_Sh().getCheck_in(), Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 20,5));
		Clear(pom.get_Instance_Sh().getCheck_out());
		input_value(pom.get_Instance_Sh().getCheck_out(), Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 21,5));
		dropdown("ByIndex", pom.get_Instance_Sh().getAdults_per_room(), "1");
		dropdown("ByIndex", pom.get_Instance_Sh().getLocation(), "5");
		Click(pom.get_Instance_Sh().getSearch());
		log.info("Searching Hotel Completed");

		Click(pom.get_Instance_Ch().getRadio_Btn());
		Click(pom.get_Instance_Ch().getCont());
		log.info("Selected Hotel Completed");

		input_value(pom.get_Instance_Bh().getLname(), Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 27,5));
		input_value(pom.get_Instance_Bh().getLname(),Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 28,5));
		input_value(pom.get_Instance_Bh().getAddress(),Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 29,5));
		input_value(pom.get_Instance_Bh().getCredit_card_no(),Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 32,5));
		dropdown("ByValue", pom.get_Instance_Bh().getCredit_card_type(), "VISA");
		dropdown("ByIndex", pom.get_Instance_Bh().getExpmnt(), "5");
		dropdown("ByIndex", pom.get_Instance_Bh().getExpyr(), "5");
		input_value(pom.get_Instance_Bh().getCvv(),Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Adactin_TestCase.xlsx", 35,5));
		Click(pom.get_Instance_Bh().getBook());
		log.warn("Payment completed");

		Thread.sleep(5000);
		Click(pom.get_Instance_Orders().getItinerary());

	}

}
