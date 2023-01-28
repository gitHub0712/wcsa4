package popup;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		

		ChromeOptions co=  new  ChromeOptions ();
		
		co.addArguments("--disable-notifications");
		
		

		co.addArguments("-start-maximized");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://www.poma.net/en/");
	}
	
	
}
		