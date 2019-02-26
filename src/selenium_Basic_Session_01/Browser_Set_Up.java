package selenium_Basic_Session_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser_Set_Up {

	public static void main(String[] args) throws InterruptedException {

/* System.setProperty("webdriver.chrome.driver",
	 	"F:\eclipse-workspace\Selenium_Basic\browser_drivers\chromedriver.exe");
 */
 System.setProperty("webdriver.ie.driver",
		"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\IEDriverServer.exe");
 WebDriver driver = new InternetExplorerDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 
 driver.get("https://www.google.com/");

	}

}
