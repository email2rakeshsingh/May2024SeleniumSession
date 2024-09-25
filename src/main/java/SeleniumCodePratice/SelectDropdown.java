package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.xpath("(// select[@class='dropdown' ])[1]");
		By numberofemp = By.xpath("//select[@class='dropdown'and @name='NoOfEmployees']");

		doSelectByValues(country, "Angola");
		doSelectBytext(numberofemp, "151 - 200");
	}
//		WebElement conWebElement = driver.findElement(numberofemp);
//		WebElement contyElement = driver.findElement(country);
//		Select select1 = new Select(conWebElement);
//		Thread.sleep(5000);
//		select1.selectByIndex(5);
//
//		Select select = new Select(contyElement);
//		select.selectByIndex(5);
//	}

	// write utility

	public static void doSelectByIndex(By locater, int index) {
		Select select = new Select(getElement(locater));
		select.selectByIndex(index);

	}

	public static void doSelectByValues(By locater, String value) {
		Select select = new Select(getElement(locater));
		select.selectByValue(value);

	}

	public static void doSelectBytext(By locater, String text) {
		Select select = new Select(getElement(locater));
		select.selectByVisibleText(text);

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);
	}

}
