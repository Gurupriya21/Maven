package com.Data_Driven_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\produ\\Downloads\\Gurupriya\\Data Driven Framework\\Write Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Guru").createRow(0).createCell(0).setCellValue("Emp_Name");
		wb.getSheetAt(0).getRow(0).createCell(1).setCellValue("Emp_Salary");
		wb.getSheetAt(0).createRow(1).createCell(0).setCellValue("Gurupriya");
		wb.getSheetAt(0).getRow(1).createCell(1).setCellValue("85000");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Completed");
		
	}

}
