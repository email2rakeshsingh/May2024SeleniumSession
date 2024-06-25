package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandel {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		// driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_21']")).click();
		// driver.findElement(By.xpath("//a[text()=
		// 'Joe.Root']//parent::td/preceding-sibling::td/input")).click();

//		String xpath = "//a[text()='Kevin.Mathews']//parent::td/preceding-sibling::td/input";
//		driver.findElement(By.xpath(xpath)).click();

		System.out.println(getUserList("Garry.White"));
		System.out.println(getUserList("Jasmine.Morgan"));
		System.out.println(getUserList("Garry.White"));

	}

	public static void selectUser(String name) {

		String xpath = "//a[text()='" + name + "']//parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();

	}

	public static List<String> getUserList(String name) {

		System.out.println("User name :" + name);
		List<WebElement> list = driver
				.findElements(By.xpath("//a[text()=  '" + name + "']//parent::td/following-sibling::td"));
		List<String> ListCol = new ArrayList<String>();
		for (WebElement e : list) {
			String allLiString = e.getText();
			ListCol.add(allLiString);

		}
		return ListCol;

	}

}
