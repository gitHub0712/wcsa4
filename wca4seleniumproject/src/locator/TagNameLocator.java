package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Promod/Desktop/Desktop/HTML/Textbox.html");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("VimalKing");
		 
		 
	}

}
