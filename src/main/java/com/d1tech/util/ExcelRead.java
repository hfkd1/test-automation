package com.d1tech.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	private String url;
	private String email;
	private String password;
	private String searchItem;

	public ExcelRead() throws IOException {
		try {
			
			FileInputStream file = new FileInputStream(new File("src/main/resources/N11LogIn.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			url = sheet.getRow(0).getCell(0).getStringCellValue();
			email = sheet.getRow(0).getCell(1).getStringCellValue();
			password = sheet.getRow(0).getCell(2).getStringCellValue();
			searchItem = sheet.getRow(0).getCell(3).getStringCellValue();
			file.close();
			workbook.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String eMail) {
		this.email = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
	}
}
