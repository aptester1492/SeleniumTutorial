package selenium_Basic_Session_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
		//action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
	}

}
