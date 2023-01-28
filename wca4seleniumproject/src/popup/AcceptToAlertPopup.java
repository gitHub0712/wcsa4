package popup;

import java.time.Duration;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptToAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Promod/Desktop/Documents/Automation/Alert.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(4000);
		//a1.accept();
		String stringText = a1.getText();
		System.out.println(stringText);
		a1.sendKeys("Admin");
		
		a1.dismiss();
		driver.close();
		
	}
}
 