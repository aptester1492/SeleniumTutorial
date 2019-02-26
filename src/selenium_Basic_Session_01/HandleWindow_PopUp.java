package selenium_Basic_Session_01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow_PopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse-workspace\\Selenium_Basic\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); /// maximize windows
		driver.manage().deleteAllCookies();

		driver.get("http://popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		Thread.sleep(3000);
		Set<String> handler = driver.getWindowHandles();

		Iterator<String> itr = handler.iterator();

		String parentWindowId = itr.next();
		System.out.println("parent windowId is:" + parentWindowId);

		String childWindowId = itr.next();
		System.out.println("Child window Id:" + childWindowId);

		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);

		System.out.println("child window Id tilte:" + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		System.out.println("parent window Id:" + driver.getTitle());
		driver.close();

	}

}
