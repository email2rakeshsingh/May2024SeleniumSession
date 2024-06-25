package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String ParentnewWindow = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(ParentnewWindow);
		System.out.println(driver.getTitle());

	}

}
