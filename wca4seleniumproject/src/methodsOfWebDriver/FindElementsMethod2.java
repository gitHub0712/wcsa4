package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod2 {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.diver","./drivers/chromedriver.exe");
		
	   WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(4000);
		
		List<WebElement> suggestions= driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		
		for (int i=0;i<suggestions.size();i++)		
		{
			   
			WebElement suggestion= suggestions.get(i);
			String textofTheWebElement =  suggestion.getText();
			System.out.println(textofTheWebElement);
			
		}
		
		
		
		

}


	}
