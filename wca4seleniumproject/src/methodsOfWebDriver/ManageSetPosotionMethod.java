package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetPosotionMethod {

	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
	      
			// System Property for Chrome Driver   
		    System.setProperty("webdriver:chrome.driver","./drivers/chromedriver.exe");  
		            
		            WebDriver driver= new ChromeDriver();
		            
		            driver.manage().window().maximize();
		            
		           Thread.sleep(2000);
		            
		            Point targetPosition = new Point(30,250);
		            
		            driver.manage().window().setPosition(targetPosition);
		            
		            
		            
		            
		           

	}

}
