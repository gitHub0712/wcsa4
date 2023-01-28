package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver" ,"./drivers/ChromeDriver.exe");
		
		 WebDriver driver= new  ChromeDriver();
		 
		 driver.manage().window().maximize();

             driver.get("https://www.youtube.com");
             
             
             
        
	}

}
