package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class ActitimeInvalidCreds {
		
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("http://desktop-e5dsoud/login.do");
			
			Thread.sleep(2000);
			FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("invalidcreds");
			Row row = sheet.getRow(1);
			org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
			String username = cell.getStringCellValue();
			
			
			FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
			Workbook wb2 = WorkbookFactory.create(fis2);
			org.apache.poi.ss.usermodel.Sheet sheet2 = wb2.getSheet("invalidcreds");
			Row row2 = sheet2.getRow(1);
			org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(1);
			String password = cell2.getStringCellValue();
			
			
		   driver.findElement(By.name("username")).sendKeys(username);
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys(password);
		   driver.findElement(By.id("loginButton")).click();
		   
		   
		}

	}

