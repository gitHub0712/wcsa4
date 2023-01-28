package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenShotByUsingTypeCasting {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver" ,"./drivers/chromedriver. exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://pixabay.com/images/search/nature/");
		 
		 TakesScreenshot ts =  (TakesScreenshot)driver;
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./ScreenShot/Screenshot1.png");
		 
		 Files.copy(src,dest);
				 
		 
		
	


		
	}

}
