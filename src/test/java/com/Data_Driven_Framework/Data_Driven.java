package com.Data_Driven_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	
	public static  void PCD() throws IOException {
		File f = new File("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Dummy data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		CellType type = c.getCellType();
		if(type.equals(CellType.STRING)){
		String str = c.getStringCellValue();
		System.out.println(str);
		}
		else if (type.equals(CellType.NUMERIC)){
		double d = c.getNumericCellValue();
		int i = (int)d;
		System.out.println(i);
		}
		wb.close();
	}
	
	public static void AD() throws IOException {
		File f =new File("C:\\Users\\produ\\eclipse-workspace\\Maven_Project\\Test Cases\\Dummy data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for(int i=0; i<s.getPhysicalNumberOfRows();i++){
		Row r = s.getRow(i);
		for(int j=0; j<r.getPhysicalNumberOfCells(); j++){
		Cell c = r.getCell(j);
		CellType type = c.getCellType();
		if(type.equals(CellType.STRING)){
		String str = c.getStringCellValue();
		System.out.println(str);
		}
		else if (type.equals(CellType.NUMERIC)){
		double d = c.getNumericCellValue();
		int value = (int)d;
		System.out.println(value);
		}
		wb.close();
		}
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Particular Cell Data :- ");
		PCD();
		System.out.println("All Data :-");
		AD();
	}
		
}