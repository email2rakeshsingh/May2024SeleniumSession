package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		String placeHolderString = driver.findElement(By.id("Form_getForm_Email")).getAttribute("placeholder");
		System.out.println(placeHolderString);

		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Rakesh");
		String value = driver.findElement(By.id("Form_getForm_Email")).getAttribute("value");
		System.out.println(value);

		// Genraic method

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

}
