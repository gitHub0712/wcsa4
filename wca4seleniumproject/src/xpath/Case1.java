package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(200);
		 driver.close();
	}

}
