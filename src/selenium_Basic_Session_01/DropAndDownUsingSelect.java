package selenium_Basic_Session_01;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDownUsingSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); /// maximize windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=10.0_1");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		//driver
		
		String date="14/February/2019";
		
		String datearr[]=date.split("/"); ///string array concept split string///
		
		String day=datearr[0];
		String month=datearr[2];
		String year=datearr[3];
		
		

		driver.findElement(By.xpath("//button[@type='button' and @class='btn-datepicker' and @xpath='1']")).click();
		
		
		
	}

}
