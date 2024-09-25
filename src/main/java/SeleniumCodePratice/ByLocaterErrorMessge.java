package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocaterErrorMessge {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email");
		By Password = By.id("input-password");
		By loginBtn = By.xpath("//input[@class='btn btn-primary']");
		By erroMessageBy = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
		By link = By.linkText("Register");

		doClick(link);

		doSendKey(emailId, "Raj@123.com");
		doSendKey(Password, "1234");
		doClick(loginBtn);
		String errorMessge = getErrorText(erroMessageBy);
		System.out.println(errorMessge);
		if (errorMessge.contains("Warning")) {
			System.out.println("Error message is displayed");

		} else {
			System.out.println("No error messge ");
		}

	}

	public static String getErrorText(By locater) {
		return getElement(locater).getText();

	}

	public static void doClick(By locater) {
		getElement(locater).click();
	}

	public static void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

}
