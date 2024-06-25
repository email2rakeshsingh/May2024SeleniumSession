package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandelWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		// Utilities create

		By dropdown = By.xpath("//select[@id='searchDropdownBox']/option");
		withoutSelectvaluesinDropdown(dropdown, "Beauty");
	}

	private static void withoutSelectvaluesinDropdown(By locater, String values) {
		List<WebElement> dropDownVal = driver.findElements(locater);
		System.out.println(dropDownVal.size());

		for (WebElement e : dropDownVal) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains("values")) {
				e.click();
				break;

			}
		}
	}
}
