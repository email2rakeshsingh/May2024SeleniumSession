package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClassDropDownValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		By dropDownVlaues = By.xpath("// select[@name='url']/option");
		doSelectDropdownValues(dropDownVlaues, "Software");

//		List<WebElement> allValuesDrop = driver.findElements(By.xpath("// select[@name='url']/option"));
//
//		System.out.println(allValuesDrop.size());
//
//		for (WebElement e : allValuesDrop) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("Software")) {
//				e.click();
//				break;
//
//			}

	}

	public static void doSelectDropdownValues(By locator, String value) {

		List<WebElement> allValuesDrop = driver.findElements(locator);

		for (WebElement e : allValuesDrop) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}

		}
	}
}
