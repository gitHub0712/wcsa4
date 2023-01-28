package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
           WebDriver driver =new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.selenium.dev/documentation/");
           Thread.sleep(2000);
           
           driver.findElement(By.linkText("an annual conference")).click();
           
           
           driver.close();
           

}
}

