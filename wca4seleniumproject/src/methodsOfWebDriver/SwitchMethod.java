package methodsOfWebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchMethod {

	public static void main (String[]args) throws InterruptedException{

		System.setProperty("WebDriver.Chrome.driver","./drivers/Chromedriver. exe");

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate(). to("https:///www.google.co.in/");     
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();


	}



}