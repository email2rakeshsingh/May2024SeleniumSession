package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKey {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
//		Actions act = new Actions(driver);
//
//		act.sendKeys(driver.findElement(By.id("Form_getForm_Name")), "Rakesh ji").perform();
		By email = By.id("Form_getForm_Email");
		By nameBy = By.id("Form_getForm_Name");
		By phone = By.id("Form_getForm_Contact");
		By buttonClick = By.xpath("//div[@class='footer-main']//a[contains(text(),'Careers')]");
//		doActionsSendKeys(nameBy, "Rakesh ji ");
//		doActionsSendKeys(email, "email2rakeshsingh@gmail.com");
//		doActionsSendKeys(phone, "95468562");
		doActionsClick(buttonClick);
	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static void doActionsSendKeys(By locater, String values) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locater), values).perform();

	}

	public static void doActionsClick(By locater) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locater)).perform();

	}

}
