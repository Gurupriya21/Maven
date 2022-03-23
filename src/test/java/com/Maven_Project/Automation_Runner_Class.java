package com.Maven_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Automation.Pom.Automation_Page_Object_Manager;

public class Automation_Runner_Class extends Base_Class_Runner {
	public static WebDriver driver = browser ("chrome");

	public static Automation_Page_Object_Manager pom = new Automation_Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automation_Runner_Class.class);
	
	public static void main(String[] args) throws IOException {
	PropertyConfigurator.configure("log4j.properties");
		navigate("http://automationpractice.com/index.php");

		Click(pom.getHp().getSignin_Btn());
		log.info("Clicked signin btn");
		
		input_value(pom.getSn().getEmail(), Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Automation_TestCase.xlsx", 2, 5));
		input_value(pom.getSn().getPassword(), Particular_Data("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Automation_TestCase.xlsx", 8, 5));
		Click(pom.getSn().getLogin_Btn());
		log.info("Sigin completed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Click(pom.getDs().getDress());
		Click(pom.getDs().getSize());
		Click(pom.getDs().getMaterial());
		Click(pom.getDs().getView());
		Click(pom.getDs().getAdd_to_cart());
		Click(pom.getDs().getCheckout());
		log.info("Order confirmed");

		Click(pom.getSum().getSummary_Checkout());

		Click(pom.getBa().getAddress_checkout());

		Click(pom.getDelivery().getCheck_box());
		Click(pom.getDelivery().getShipping_checkout());

		Click(pom.getPa().getPayment());
		Click(pom.getPa().getOrder_confirm());
		log.info("Payment confirmed");

	}
}
