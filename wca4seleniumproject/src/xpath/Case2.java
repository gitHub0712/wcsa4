package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[.='password']")).sendKeys("admin123");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[.=' Login ']")).click();
		 Thread.sleep(100000);
		 driver.close();
	}

}
