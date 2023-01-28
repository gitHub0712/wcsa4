package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[@class='tw-8216tu'and (contains(text(),'Softride Pro Coast'))]")).click();
		
	}

}
