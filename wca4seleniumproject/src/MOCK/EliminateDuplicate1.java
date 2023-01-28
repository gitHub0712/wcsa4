package MOCK;
import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Promod/Desktop/Documents/Automation/pramod.html");
		
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDownElement);
		
	      List<WebElement> allOptions = sel.getOptions();
	      
	              
	           TreeSet<String> s = new TreeSet<String>();
	        
	              for(int i=0;i<allOptions.size();i++)
	              {
	            	  WebElement opts = allOptions.get(i);
	            	  String values = opts.getText();
	            	  
	            	  
	            	  s.add(values);
	            	  
	              }
	              
	              for(String options:s)
	              {
	            	  System.out.println(options);
	              }
	   
	}
	
	

}