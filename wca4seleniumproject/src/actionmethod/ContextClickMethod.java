package actionmethod;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ContextClickMethod {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///C:/Users/Promod/Desktop/Documents/Automation/.html");
			
			WebElement target = driver.findElement(By.id("i1"));
			
			Actions act = new Actions(driver);
			//to perform right click  action
			act.contextClick(target).perform();
		}

	}


