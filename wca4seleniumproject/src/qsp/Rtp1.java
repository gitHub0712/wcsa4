package qsp;
	

	import java.util.Scanner;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


public class Rtp1 {
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the browserName");
			String browservalue = sc.nextLine();

			if (browservalue.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// to avoide IllegalStateException
				driver = new ChromeDriver();// to Launch Chrome browser
				driver.manage().window().maximize();// to maximaize browser
				Thread.sleep(4000); // to provide delay of 4 sec to script
				driver.close();// to close the browser
			}

			else if (browservalue.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");// to avoide IllegalStateException
				driver = new FirefoxDriver();//to Launch Firefox browser
				driver.manage().window().maximize();// to maximaize browser
				Thread.sleep(4000);// to provide delay of 4 sec to script
				driver.close();// to close the browser

			} else {
				System.out.println("enter valid browser");
			}

		}
	}


