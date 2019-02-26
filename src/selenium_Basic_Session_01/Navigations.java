package selenium_Basic_Session_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    ///maximize windows
		driver.manage().deleteAllCookies();  
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
// launch the url.......		
		driver.get("https://www.google.com");
		
// if we want to switch to external url use navigate().to()		
		driver.navigate().to("https://www.amazon.com/");
		
		
	//back and forward button simulation	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();	
	//refresh method	
		driver.navigate().refresh();
		
		
	}

}
