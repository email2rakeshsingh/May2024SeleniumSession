package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Current URL: " + driver.getCurrentUrl());

		driver.quit();
	}
}
