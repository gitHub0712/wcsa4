package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver. exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.co.in/om");
		
		driver.manage().window().maximize();
		

		driver.findElement(By.className("q")).sendKeys("selenium");
		
		driver.findElement(By.className("q")).sendKeys("keys.Return");
		
		driver.findElement(By.xpath("/h3[normalize-space()'selenium']")).click();
		
		

	}

}
