package selenium_Basic_Session_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); /// maximize windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		//isDisabled()
		boolean b1=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed(); //check GoogleLogo
		System.out.println(b1);// if it is display return true
		
		Thread.sleep(3000);
		driver.navigate().to("https://login.yahoo.com/");
		//isEnabled()
		boolean b2=driver.findElement(By.xpath("//label[@for='persistent']")).isSelected();
		System.out.println(b2);
		
		
		
		
		
		
		
		
		
		

	}

}
