package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

//		String getAttributr = driver.findElement(By.xpath("(//input[@class='text'])[1]")).getAttribute("placeholder");
//		System.out.println(getAttributr);
//
//		driver.findElement(By.xpath("//input[@class='text' and @id='Form_getForm_Name']")).sendKeys("Rakesh");
//		String sendName = driver.findElement(By.xpath("//input[@class='text' and @id='Form_getForm_Name']"))
//				.getAttribute("value");
//		System.out.println(sendName);

		By nameVlues = By.xpath("//input[@class='text' and @id='Form_getForm_Name']");
		By placeHolder = By.xpath("//input[@class='text' and @id='Form_getForm_Name']");
		doSendKey(nameVlues, "Rakesh");
		String name = dogetAttribute(nameVlues, "value");
		System.out.println(name);

		String plceHolder = dogetAttribute(placeHolder, "placeholder");
		System.out.println(plceHolder);

		if (doIsDisplayed(placeHolder)) {

			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static boolean doIsDisplayed(By locater) {
		return getElement(locater).isDisplayed();

	}

	public static String dogetAttribute(By locater, String value) {
		return getElement(locater).getAttribute(value);
	}

	public static void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

}
