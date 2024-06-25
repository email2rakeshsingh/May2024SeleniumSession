package seleniumsessions;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksFooterLink {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By footerlink = By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div/ul/li");

		getElementFromSections(footerlink, "Help");

	}

	public static void getElementFromSections(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);
		System.out.println(eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text); // Printing the text of the element instead of the value to check

			if (text.contains(value)) {
				e.click();
				break;
			}
		}

	}
}
