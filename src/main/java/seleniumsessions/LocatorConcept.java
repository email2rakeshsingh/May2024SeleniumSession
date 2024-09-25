package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By button = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
//		By messge = By.xpath("//*[@id=\"account-login\"]/div[1]");
//
//		doSendKeys(emailId,"email2rakeshsingh@gmail.com");
//		doSendKeys(pwd,"1234");
//		doClick(button);
//		String errorMsge = driver.findElement(messge).getText();
//		if (errorMsge.contains("Warning")) {
//			System.out.println("correct error message");
//		} else {
//			System.out.println("Not Correct message");
//		}
		// driver.findElement(By.linkText("Register")).click();

		By registerLink = By.linkText("Register");
		By Login = By.linkText("Login");
		doClick(registerLink);
		doClick(Login);

	}

	public static void getErrorMessge(By locator) {
		getElement(locator).getText();

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String values) {
		getElement(locator).sendKeys(values);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
