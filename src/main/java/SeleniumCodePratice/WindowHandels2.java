package SeleniumCodePratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();

		String parentWindowHandel = it.next();
		System.out.println("parent window id :" + parentWindowHandel);

		String chieldWindowID = it.next();
		System.out.println("Chiled window id :" + chieldWindowID);

		// switch to window

		driver.switchTo().window(chieldWindowID);
		System.out.println("Child title print :" + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowHandel);
		System.out.println("Parent window title :" + driver.getTitle());

	}

}
