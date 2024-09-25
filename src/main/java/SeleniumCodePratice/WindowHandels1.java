package SeleniumCodePratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();

		String parentWindowIDS = it.next();
		System.out.println("Parent window ID :" + parentWindowIDS);

		String chieldWindoID = it.next();
		System.out.println("Chield window id :" + chieldWindoID);

		// move to chield window

		driver.switchTo().window(chieldWindoID);
		System.out.println("Chield window id :" + driver.getTitle());

		driver.close();
		driver.switchTo().window(parentWindowIDS);
		System.out.println("Chield window id :" + driver.getTitle());

	}

}
