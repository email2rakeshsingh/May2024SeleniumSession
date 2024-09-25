package InterviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwordNavigationMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

	}

}
