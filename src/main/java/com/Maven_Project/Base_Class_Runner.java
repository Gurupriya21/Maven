package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Runner {

	public static WebDriver driver;
	public static String value;

	public static WebDriver browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void navigate(String url) {
		driver.navigate().to(url);
	}

	public static void Click(WebElement elemet) {
		elemet.click();

	}

	public static void Clear(WebElement element) {
		element.clear();

	}
	public static String Particular_Data(String location, int row, int clm) throws IOException {
		
		File f = new File(location);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
	
		Row r = s.getRow(row);
		Cell c = r.getCell(clm);
		CellType type = c.getCellType();
		if(type.equals(CellType.STRING)){
		value = c.getStringCellValue();
		}
		else if (type.equals(CellType.NUMERIC)){
		double d = c.getNumericCellValue();
		int i = (int)d;
		value = String.valueOf(i);
		} 
		wb.close();
		return value;
	}
	

	public static void input_value(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void dropdown(String type, WebElement element, String Value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("ByIndex")) {
			int index = Integer.parseInt(Value);
			s.selectByIndex(index);
		}

		else if (type.equalsIgnoreCase("ByValue")) {
			s.selectByValue(Value);

		}

		
		
		
		
	}



}
