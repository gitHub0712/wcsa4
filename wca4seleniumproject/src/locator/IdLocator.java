package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
           WebDriver driver =new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://desktop-e5dsoud/login.do");
           
           driver.findElement(By.name("username")).sendKeys("admin");
           Thread.sleep(2000);
           driver.findElement(By.name("pwd")).sendKeys("manager");
           Thread.sleep(2000);
           driver.findElement(By.id("loginButton")).click();
           Thread.sleep(2000);
           
           
           driver.close();
           

}
}