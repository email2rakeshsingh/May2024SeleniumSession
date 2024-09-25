package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();

		// window handler API

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowID = it.next();
		System.out.println("Parent window ID :" + parentWindowID);

		String childWindowID = it.next();
		System.out.println("Child window ID :" + childWindowID);

		// switch to child window

		driver.switchTo().window(childWindowID);
		System.out.println("Child window title is :" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is :" + driver.getTitle());
	}

}
