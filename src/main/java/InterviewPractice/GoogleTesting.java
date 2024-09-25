package InterviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTesting {

	public static void main(String[] args) {

		// automation step

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// validation point

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Google")) {

			System.out.println("Correct title");
		} else {
			System.out.println("Not correct title ");
		}
		String urlString = driver.getCurrentUrl();
		System.out.println(urlString);
		driver.close();
		driver.quit();

	}

}
