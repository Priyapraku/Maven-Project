package com.utility;

import java.io.File;

import org.apache.poi.extractor.MainExtractorFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String getParticularData(int rowType , int column) {
		String data = null;
		try {
			File file = new File("C:\\Users\\AWS DevOps\\Downloads\\DataDriven_IPT.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			Row row =sheet.getRow(rowType);
			Cell cell = row .getCell(column);
		 data =cell.getStringCellValue();
			System.out.println(data);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}	
	//public static void main(String[] args) {
	//	getParticularData(3, 0);
	}
	
	
	

	