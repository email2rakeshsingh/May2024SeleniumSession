package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadLessMode {

	public static void main(String[] args) {

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--HeadLess");

		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
