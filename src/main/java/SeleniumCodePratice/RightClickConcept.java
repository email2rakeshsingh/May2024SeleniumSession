package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		// Setup WebDriver (Make sure to set the correct path for your driver)

		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		// Locate the element to right-click on
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));

		// Initialize Actions class to perform right-click
		Actions act = new Actions(driver);

		// Perform right-click on the element
		act.contextClick(rightClick).perform();

		// Get all context menu items
		List<WebElement> list = driver.findElements(By
				.xpath("//ul[@class='context-menu-list context-menu-root']//li[contains(@class,'context-menu-icon')]"));

		// Iterate through each context menu item and click on it
		for (WebElement e : list) {
			String text = e.getText();
			System.out.println("Clicking on: " + text);
			e.click();

			// Handle the JavaScript pop-up alert
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert Text: " + alert.getText());
			alert.accept();

			// Right-click again to reopen the context menu for the next item
			act.contextClick(rightClick).perform();
		}

		// Close the browser
		// driver.quit();
	}
}
