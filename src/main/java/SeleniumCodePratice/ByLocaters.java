package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocaters {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailid = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKey(emailid, "Rakesh@gmailc.com");
		ele.doSendKey(pwd, "rakesh");

	}

	public static void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

}
