package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// String gethandel = driver.getWindowHandle();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[1]")).click();

		Set<String> handel = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(handel);

		String ParentWinID = list.get(0);
		String ChildWinID = list.get(1);

		driver.switchTo().window(ChildWinID);
		System.out.println("Child window ID : " + ChildWinID);
		driver.close();

		driver.switchTo().window(ParentWinID);
		System.out.println("Parent window id :" + ParentWinID);

	}

}
