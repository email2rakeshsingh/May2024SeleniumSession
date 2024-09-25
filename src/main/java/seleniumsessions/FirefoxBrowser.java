package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			System.out.println("This is correct output");

		} else {

			System.out.println("Output is not correct");

		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();
	}

}
