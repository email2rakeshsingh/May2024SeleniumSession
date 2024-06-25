package seleniumsessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleImagesFind {
	static WebDriver driver;

	public static void main(String[] args) {
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Open the website
		driver.get("https://www.bigbasket.com/");

		// Locators for images and links
		By imagesListLocator = By.tagName("img");
		By linksListLocator = By.tagName("a");

		// Get element counts
		int linkCount = getElementCount(linksListLocator);
		int imagesCount = getElementCount(imagesListLocator);

		// Print counts
		System.out.println("Link count: " + linkCount);
		System.out.println("Images count: " + imagesCount);

		// Print image and link details
		printImageDetails(imagesListLocator);
		printLinkDetails(linksListLocator);

		// Close the driver
		driver.quit();
	}

	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void printImageDetails(By locator) {
		List<WebElement> imagesList = getElements(locator);

		for (WebElement e : imagesList) {
			String srcValue = e.getAttribute("src");
			String altValue = e.getAttribute("alt");
			String classValue = e.getAttribute("class");

			// Handle null or empty attributes
			altValue = (altValue != null && !altValue.isEmpty()) ? altValue : "No alt attribute";
			srcValue = (srcValue != null && !srcValue.isEmpty()) ? srcValue : "No src attribute";
			classValue = (classValue != null && !classValue.isEmpty()) ? classValue : "No class attribute";

			// Print the attributes
			System.out.println("Image Details:");
			System.out.println("Alt: " + altValue);
			System.out.println("Src: " + srcValue);
			System.out.println("Class: " + classValue);
			System.out.println("------------------------");
		}
	}

	public static void printLinkDetails(By locator) {
		List<WebElement> listLink = getElements(locator);

		for (WebElement e : listLink) {
			String hrefValue = e.getAttribute("href");
			String textValue = e.getText();
			String classValue = e.getAttribute("class");

			// Handle null or empty attributes
			hrefValue = (hrefValue != null && !hrefValue.isEmpty()) ? hrefValue : "No href attribute";
			textValue = (textValue != null && !textValue.isEmpty()) ? textValue : "No text content";
			classValue = (classValue != null && !classValue.isEmpty()) ? classValue : "No class attribute";

			// Print the attributes
			System.out.println("Link Details:");
			System.out.println("Href: " + hrefValue);
			System.out.println("Text: " + textValue);
			System.out.println("Class: " + classValue);
			System.out.println("------------------------");
		}
	}
}