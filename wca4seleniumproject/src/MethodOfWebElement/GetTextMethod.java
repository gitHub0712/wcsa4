package MethodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class GetTextMethod {

public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.drivr","./drivers.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://omayo.blogspot.com/");
		
		  driver.findElement(By.partialLinkText(" popup window"));
		  
	WebElement link = null;
	String textOfLink= link.getText();
		  
		  System.out.println(textOfLink);
		  
		
		
}
}