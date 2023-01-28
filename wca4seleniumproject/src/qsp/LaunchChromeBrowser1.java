package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser1 {

	public static void main(String[] args) throws InterruptedException { 
	      
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// to avoide IllegalStateException
		ChromeDriver driver = new ChromeDriver();// to Launch Chrome browser
		driver.manage().window().maximize();// to maximaize browser
		Thread.sleep(4000); 
		  driver.get("https://www.instagram.com/accounts/login/");
          
		Thread.sleep(4000); // to provide delay of 4 sec to script
		driver.close();// to close the browser
	}           
		
	}
		

	


