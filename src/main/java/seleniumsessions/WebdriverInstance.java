package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInstance {

	public static void main(String[] args) {

		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();

		driver1.get("https://www.google.com");
		driver2.get("https:flipkart.com/");
		driver3.get("https://www.youtube.com");

	}

}
