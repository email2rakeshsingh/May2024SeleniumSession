package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			System.out.println("correct title");

		} else {
			System.out.println("incorrect title");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();

	}

}
