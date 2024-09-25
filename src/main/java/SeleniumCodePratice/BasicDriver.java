package SeleniumCodePratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDriver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		System.out.print(title);

		if (title.equals("Google")) {

			System.out.println("Correct title is displayed :" + title);
		} else {
			System.out.println("Title is not prasent :" + title);
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current urls is present :" + currentUrl);

		driver.quit();

	}

}
