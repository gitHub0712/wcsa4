package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlurstonePopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com");
		
		Thread.sleep(200);
	   driver.findElement(By.xpath("//span[.='Not now']")).click();
		
		Thread.sleep(200);
		
		// switch the control to th frame
		
		driver.switchTo().frame(6);
		driver.findElement(By.xpath
				
		
		dri
				
}
	}

