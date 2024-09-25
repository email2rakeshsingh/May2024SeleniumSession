package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncoginitoMode {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		driver.quit();

	}

}
