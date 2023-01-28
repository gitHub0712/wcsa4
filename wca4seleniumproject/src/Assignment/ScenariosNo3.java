package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenariosNo3 {
	
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			
			 
			 Thread.sleep(1000);
			 WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
			 
			 WebElement target = driver.findElement(By.xpath("//div[@id='draggable']")); //
		     //*[@id="droppable"]
			 
			 Actions act = new Actions(driver);
			 act.dragAndDrop(src, target).perform();
		}

	}

			
			

