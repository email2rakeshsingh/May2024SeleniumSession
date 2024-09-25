package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		String placeValue = driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		System.out.println(placeValue);
//
//		driver.findElement(By.id("input-email")).sendKeys("email2rakeshsingh@gmail.com");
//		String value = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(value);

		By EMail = By.id("input-email");
		By Password = By.id("input-password");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(EMail, "email2rakeshsingh@gmail.com");

		System.out.println(doGetAttribute(EMail, "value"));
		System.out.println(doGetAttribute(Password, "placeholder"));

		if (doisDisplayed(EMail)) {
			System.out.println("email is displayed ");

		} else {
			System.out.println("email is not displayed");

		}
	}

	public static boolean doisDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public static String doGetAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
