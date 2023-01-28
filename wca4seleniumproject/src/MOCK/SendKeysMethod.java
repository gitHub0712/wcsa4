package MOCK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.drivr","./drivers.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement UsernameTextBox= driver.findElement(By.name("username"));
		UsernameTextBox.sendKeys("Admin");
		
		
		
		 
		 driver.findElement(By.xpath("//button[.='Login']")).click();
		 
		 
			
		
	}

}
