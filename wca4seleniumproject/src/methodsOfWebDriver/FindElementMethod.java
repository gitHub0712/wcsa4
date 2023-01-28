package methodsOfWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main (String[]args){
		System.setProperty("WebDriver.Chrome.driver","./drivers/Chromedriver. exe");
		  WebDriver driver = new ChromeDriver ();
		  driver.manage().window().maximize();
          driver.get("http://desktop-e5dsoud/login.do");
          
          
         WebElement usernameTextbox = driver.findElement(By.name("username"));
 		usernameTextbox.sendKeys("admin");
 	
		System.out.println( usernameTextbox);
           
		

		
	}

}
