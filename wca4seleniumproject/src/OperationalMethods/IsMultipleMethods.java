package OperationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","./drivers/Chromedriver. exe");
		   
        WebDriver driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("file:///C:/Users/Promod/Desktop/Documents/Automation/.html");
        
        WebElement dropdownElement= driver.findElement(By.id("i1"));
        
        Select sel = new Select (dropdownElement);
        boolean status = sel.isMultiple();
         System.out.println(status);
      
  
          
        
	}

}
