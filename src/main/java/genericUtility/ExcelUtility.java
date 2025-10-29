package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheet,int r,int c) throws EncryptedDocumentException, IOException {
    	FileInputStream excel =new FileInputStream(IpathUtility.excelPath);
         Cell cell = WorkbookFactory.create(excel).getSheet(sheet).getRow(r).getCell(c);
         DataFormatter df = new DataFormatter();
         String value=df.formatCellValue(cell);
		return value;
		}
public ArrayList<String> getMultipleDataFromExcel(String sheet,int row,int col) throws EncryptedDocumentException, IOException {
	FileInputStream excel =new FileInputStream(IpathUtility.excelPath);
    Workbook wb = WorkbookFactory.create(excel);
    Sheet sh=wb.getSheet(sheet);
    DataFormatter df = new DataFormatter();
   ArrayList<String> a1 = new ArrayList<String>();
    for(int i=row;i<sh.getLastRowNum();i++) {
    	try {
    	Row r = sh.getRow(i);
    	for(int j=col;j<r.getLastCellNum();j++) {
    		Cell c = r.getCell(j);
    		String value=df.formatCellValue(c);
    		a1.add(value);
    	}
    	}
    	catch(Exception e){}
    }
    return a1;	
}
public void writeingDataToExcel(String sheetname,int row,int col,String value) throws EncryptedDocumentException, IOException {
	FileInputStream excel =new FileInputStream(IpathUtility.excelPath);
    Workbook wb = WorkbookFactory.create(excel);
    wb.createSheet(sheetname).createRow(row).createCell(col).setCellValue(value);;
    FileOutputStream fos=new FileOutputStream(IpathUtility.excelPath);
    wb.write(fos);	
}
}
