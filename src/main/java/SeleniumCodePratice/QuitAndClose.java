package SeleniumCodePratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		// driver.quit();
		driver.close();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
