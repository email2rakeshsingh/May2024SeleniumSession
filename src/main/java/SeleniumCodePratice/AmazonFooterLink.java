package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterLink {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		By footerLinks = By.xpath("// div[@class='navFooterVerticalColumn navAccessibility']//ul/li");
		printAllFooter(footerLinks);

	}

	public static void printAllFooter(By locater) {

		List<WebElement> list = driver.findElements(locater);

		for (WebElement e : list) {
			String text = e.getText();
			if (text.equals("Help")) {
				e.click();
				break;

			}

		}

	}
}
