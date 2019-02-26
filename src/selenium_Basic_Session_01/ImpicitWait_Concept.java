package selenium_Basic_Session_01;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWait_Concept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    ///maximize windows
		driver.manage().deleteAllCookies();    ///delete all cookies
		
		driver.get("https://www.ebay.com/");
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().wait();
	}

}
