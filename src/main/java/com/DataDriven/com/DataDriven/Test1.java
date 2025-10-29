package com.DataDriven.com.DataDriven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class Test1 {

	public static void main(String[] args) throws IOException {
	PropertiesUtility pUtil = new PropertiesUtility();
	
String URl=pUtil.getDataFromPropertiesFile("url");
WebDriver driver=new ChromeDriver();
driver.get(URl);
String un=pUtil.getDataFromPropertiesFile("username");
System.out.println(un);

	}
	

}
