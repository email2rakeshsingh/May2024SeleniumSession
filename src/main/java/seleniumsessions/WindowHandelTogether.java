package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String gethandel = driver.getWindowHandle();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[1]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[2]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[4]")).click();

		Set<String> getWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = getWindowHandles.iterator();

		// Initialize a variable to store the current window handle
		String originalHandle = driver.getWindowHandle();

		while (iterator.hasNext()) {
			String windowHandle = iterator.next();
			// Switch to the window handle
			driver.switchTo().window(windowHandle);
			System.out.println(driver.getTitle());
			// Check if the current window handle is not the original one before closing it
			if (!windowHandle.equals(originalHandle)) {
				driver.close();
			}
		}

		// Switch back to the original window handle
		driver.switchTo().window(originalHandle);

	}

}
