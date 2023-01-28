package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeXpathLoginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.,driver", "./drivers/chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   
		    driver.manage().window().maximize();
		    driver.get("http://desktop-e5dsoud/login.do");
		    
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		    
		    driver.findElement(By.xpath("//a[.='Login']")).click();
		    
		    Thread.sleep(4000);
		    driver.quit();
		    
		   
	}

}
