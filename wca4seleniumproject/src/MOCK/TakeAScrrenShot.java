package MOCK;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeAScrrenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver" ,"./drivers/chromedriver. exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://www.pexels.com/search/wildlife%20photography/");
		 
		 TakesScreenshot ts =  (TakesScreenshot)driver;
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./Screenshot/Screenshot.png");
		 
		 Files.copy(src,dest);
				 
	}
}