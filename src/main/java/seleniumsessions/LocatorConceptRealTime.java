package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConceptRealTime {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		By emailId= By.id("input-email");
//		By Password =By.id("input-password");
//		
//		doSendKeys(emailId, "email2rakeshsingh@gmail.com");
//		doSendKeys(Password , "Rak@1234");

		ElementUtil eleUtil = new ElementUtil(driver);

		By emailId = By.id("input-email");
		By Password = By.id("input-password");

		eleUtil.doSendKeys(emailId, "email2rakeshsingh@gmail.com");
		eleUtil.doSendKeys(Password, "Rak@1234");

	}

	public static void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

}
