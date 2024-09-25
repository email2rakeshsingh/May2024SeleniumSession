package SeleniumCodePratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();

		String ParentWindowID = it.next();
		System.out.println("pARENT WINDOW ID :" + ParentWindowID);

		String chieldWindowIDString = it.next();
		System.out.println("Chaild window id :" + chieldWindowIDString);

		driver.switchTo().window(chieldWindowIDString);
		System.out.println(driver.getTitle());

	}

}
