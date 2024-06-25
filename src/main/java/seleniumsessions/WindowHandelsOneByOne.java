package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandelsOneByOne {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// String gethandel = driver.getWindowHandle();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[1]")).click();
		Set<String> handels1 = driver.getWindowHandles();
		Iterator<String> it1 = handels1.iterator();

		String parentWindowID = it1.next();
		String childWindowID = it1.next();
		driver.switchTo().window(childWindowID);
		driver.close();
		driver.switchTo().window(parentWindowID);

		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[2]")).click();
		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();

		String childWindowID2 = null;
		while (it2.hasNext()) {
			childWindowID2 = it2.next();
			if (!childWindowID2.equals(parentWindowID)) {
				break;
			}
		}
		driver.switchTo().window(childWindowID2);
		driver.close();
		driver.switchTo().window(parentWindowID);

		// Continue with the rest of your logic for handling more windows...
	}
}
