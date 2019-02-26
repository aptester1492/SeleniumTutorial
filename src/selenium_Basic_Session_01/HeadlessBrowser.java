package selenium_Basic_Session_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); /// maximize windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com/");

		System.out.println("title is: " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']")).sendKeys("HelloWorld");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//INPUT[@class='gLFyf gsfi']/../../../..//INPUT[@value='Google Search'])[2]")).click();
        Thread.sleep(3000);
		System.out.println("after search:"+driver.getTitle());
	}

}
