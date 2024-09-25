package SeleniumCodePratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanadelsTogater {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String parentWind = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();

		while (it.hasNext()) {

			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			if (!parentWind.equalsIgnoreCase(windowID)) {
				driver.close();
				System.out.println("Not close the Parent window");

			}

		}
	}

}
