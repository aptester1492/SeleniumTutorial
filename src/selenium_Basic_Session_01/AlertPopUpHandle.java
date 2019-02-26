package selenium_Basic_Session_01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    ///maximize windows
		driver.manage().deleteAllCookies();   
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); ///click on ok button
		//alert.dismiss();  //click on cancel button
		
		Alert alert1=driver.switchTo().alert();
	}

}
