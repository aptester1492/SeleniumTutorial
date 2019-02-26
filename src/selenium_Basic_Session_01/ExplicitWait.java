package selenium_Basic_Session_01;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); /// maximize windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		clickOn(driver, driver.findElement(By.xpath("//input[@value='Log In']")),30);
		
		Thread.sleep(3000);
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path="F:\\eclipse-workspace\\Selenium_Basic\\Screenshot\\explicitwaitScreenshot.png";
		FileUtils.copyFile(src, new File(path));
			
	}
	
	public static void clickOn(WebDriver driver ,WebElement locator,int timeout) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
