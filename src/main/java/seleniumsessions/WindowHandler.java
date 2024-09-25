package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();

		// window handler API
		Set<String> windowHandel = driver.getWindowHandles();
		Iterator<String> it = windowHandel.iterator();

		String parentWindowID = it.next();
		System.out.println("Parent window ID :" + parentWindowID);

		String chieldWindowID = it.next();
		System.out.println("Child window ID :" + chieldWindowID);

		// move driver to child window

		driver.switchTo().window(chieldWindowID);
		System.out.println("child window title :" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title :" + driver.getTitle());

	}

}
