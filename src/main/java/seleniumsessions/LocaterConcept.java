package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocaterConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By EmailId = By.id("input-email");
		By password = By.id("input-password");

		doSendKeys(EmailId, "email2rakeshsingh@gmail.com");
		doSendKeys(password, "Rak@1234");

	}

	public static void doSendKeys(By locater, String valus) {
		getElement(locater).sendKeys(valus);

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

}
