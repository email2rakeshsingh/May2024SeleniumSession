package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTesting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			System.out.println("getting correct title");
		} else {
			System.out.println("Correct title not getting");

		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
