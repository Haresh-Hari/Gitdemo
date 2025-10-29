package com.DataDriven.com.DataDriven;

import java.io.IOException;
import java.util.List;

import genericUtility.ExcelUtility;


public class ExcelTest1 {
	public static void main(String[] args) throws IOException {
		 ExcelUtility eUtil = new ExcelUtility();
		
		//String URl=pUtil.getDataFromPropertiesFile("url");
		//WebDriver driver=new ChromeDriver();
		//driver.get(URl);
		//String value=eUtil.getDataFromExcel("Name",6,0);
		//System.out.println(value);
		List<String> a = eUtil.getMultipleDataFromExcel("Name", 0, 0);
        System.out.println(a);
        eUtil.writeingDataToExcel("Animal", 2, 5,"Cow");

}}
