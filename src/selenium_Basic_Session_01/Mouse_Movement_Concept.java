package selenium_Basic_Session_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Movement_Concept {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		
		    ChromeOptions option = new ChromeOptions();
			option.addArguments("window-size=1400,800");
			option.addArguments("headless");
		 
	    WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		System.out.println("Website Open for working");
		
//Mouse_Operation_Actions Class reference use
		Actions action = new Actions(driver);
// Mouse move over Add_Ons Link
		WebElement Add_Ons = driver.findElement(By.xpath("//a[text()='Add-Ons']"));
		action.moveToElement(Add_Ons).build().perform();

		Thread.sleep(10000);
// after move click on Priority Check-in
		driver.findElement(By.xpath("//ul[@class='add-ons-tab']//li[6]//a[contains(text(),'Priority Check-in')]"))
				.click();

		System.out.println("Finally its working using headless browser");
	}

}
