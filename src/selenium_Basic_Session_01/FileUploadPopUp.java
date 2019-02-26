package selenium_Basic_Session_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    ///maximize windows
		driver.manage().deleteAllCookies();   
		
		driver.get("https://html.com/input-type-file/");
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.name("fileupload"));
		//action.keyDown(ele,);
		
		ele.sendKeys("C:\\Users\\Arun Pondhe\\Documents\\ss.txt");
	}

}
