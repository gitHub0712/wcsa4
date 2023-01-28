package keyWordDrivenFrameWork;


import java.io.IOException;
import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataDrivenFrameWork.Flib;

public class BaseTest implements IAutoConstant{

	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();

		String browserValue = flib.readPropertyData("./data/config.properties","Browser");
		String url = flib.readPropertyData("./data/config.properties","url");


		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}


		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		else
		{
			System.out.println("enter the valid browserValue!!!");
		}

	}
	public void closeBrowser()
	{
		driver.quit();
	}

}