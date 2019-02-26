package selenium_Basic_Session_01;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); /// maximize windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		Thread.sleep(3000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,
				new File("F:\\eclipse-workspace\\Selenium_Basic\\Screenshot\\firstScreenshot.png"));
		/*
		 * File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src, new
		 * File("F:\\eclipse-workspace\\Selenium_Basic\\Screenshot\\firstScreenshot.png"
		 * ));
		 */
	}
}
