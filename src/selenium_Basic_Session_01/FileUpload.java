package selenium_Basic_Session_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    ///maximize windows
		driver.manage().deleteAllCookies();   
		
		driver.get("https://www.google.com/gmail/");
		
		
		
	}

}
