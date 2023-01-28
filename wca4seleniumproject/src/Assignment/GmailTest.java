package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class GmailTest {
	    public static void main(String[] args) {
	        // Set the path to the Gecko driver executable //y("WebDriver.Chrome.driver","./drivers/Chromedriver. exe");
	        System.setProperty("webDriver.gecko.driver", " ./drivers/geckodriver.exe");

	        // Create a new FirefoxOptions object to set the desired capabilities of the browser
	        FirefoxOptions options = new FirefoxOptions();

	        // Create a new FirefoxDriver instance
	        WebDriver driver = new FirefoxDriver(options);
	        
	        driver.get("https://www.gmail.com");
	        
	     // Find the username field
	        WebElement usernameField = driver.findElement(By.id("identifierId"));

	        // Enter your username
	        usernameField.sendKeys("pramodkale801@gmail.com");

	        // Find the "Next" button and click it
	        WebElement nextButton = driver.findElement(By.id("identifierNext"));
	        nextButton.click();

	      
	   
	        // Find the password field
	        WebElement passwordField = driver.findElement(By.name("password"));

	        // Enter your password
	        passwordField.sendKeys("your-password");

	        // Find the "Next" button and click it
	        nextButton = driver.findElement(By.id("passwordNext"));
	        nextButton.click();

	    }
	}
