package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	
 

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromrdriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com");
		
		 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		 
		 String parentwindow = driver.getWindowHandle();
		 
		 System.out.println(parentwindow);
		 
		 Set<String> allHandles = driver.getWindowHandles();
		 
		 for(String wh:allHandles)
		 
		 {
			 
			
			System.out.println(wh);
		 }
		 
		 
		 
		 
		 
	}	
		
}	
