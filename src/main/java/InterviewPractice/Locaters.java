package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.id("input-email");
		By password = By.id("input-password");
		By submitBy = By.xpath("//input[@type='submit']");

		doSendKey(email, "email2rakeshsingh@gmail.com");
		doSendKey(password, "Rak@1234");
		doClick(submitBy);

	}

	public static void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static void doClick(By locater) {
		getElement(locater).click();

	}

}
