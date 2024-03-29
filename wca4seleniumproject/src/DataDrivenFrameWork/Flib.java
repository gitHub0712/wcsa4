package DataDrivenFrameWork;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// is use to  store generic reusable method...


	// read Excel Data
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		return data;
	}

	// to get Last RowCount
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("/data/ActiTimeTestData.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	
	// Write Excel Data
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("/data/ActiTimeTestData.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("nvalidcreds");
		Row row = sheet.getRow(rowCount);
		// ------------------------------------------------------
		Cell cell = row.createCell(1);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream("/data/ActiTimeTestData.xlsx");
		wb.write(fos);

	}
     
	// read the data from property file
	
	public String readPropertyData(String propPath,String keyValue) throws IOException 
	{
		 FileInputStream fis = new FileInputStream("./data/config.properties");
		 
		 Properties prop = new Properties();
		 prop.load(fis);
		 String data = prop.getProperty(keyValue);
		 return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		

		