package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {
	static WebDriver driver;

	public static void main(String[] args) {

		/*
		 * please print all dorp down values without method select values *
		 */

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		// By dropdown = By.xpath("// select[@name='url']");
		// doPrintandClik(dropdown);

		Select select = new Select(driver.findElement(By.xpath("// select[@name='url']")));
		List<WebElement> countryPrint = select.getOptions();
		System.out.println(countryPrint.size());

		for (WebElement e : countryPrint) {

			String text = e.getText();
			System.out.println(text);
			if (text.contains("Software")) {
				e.click();
				break;

			}

		}

//	public static void doPrintandClik(By locater) {
//
//		Select select = new Select(getElement(locater));
//		List<WebElement> countryPrint = select.getOptions();
//		System.out.println(countryPrint.size());
//		for (WebElement e : countryPrint) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//
//	}
//
//	public static WebElement getElement(By locater) {
//		return driver.findElement(locater);
//
	}
}
