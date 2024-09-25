package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {
			// Navigate to the URL
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

			// Initialize Actions class
			Actions act = new Actions(driver);

			// Locate the element to right-click on
			WebElement rightClickElement = driver
					.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

			// Perform a right-click (context click) on the element
			act.contextClick(rightClickElement).build().perform();

			// Locate all context menu items
			List<WebElement> rightClickMenuItems = driver.findElements(By.xpath(
					"//ul[@class='context-menu-list context-menu-root']/li[contains(@class, 'context-menu-icon')]"));

			// Iterate through all context menu items and click each one
			for (WebElement menuItem : rightClickMenuItems) {
				String itemText = menuItem.getText();
				System.out.println("Clicking on: " + itemText);
				menuItem.click();

				// Handle alert popup (if any) to confirm the action
				try {
					driver.switchTo().alert().accept();
				} catch (Exception ex) {
					System.out.println("No alert present after clicking " + itemText);
				}

				// Break out of the loop if the item clicked was "Copy"
				if (itemText.equals("Copy")) {
					System.out.println("Clicked on 'Copy'. Exiting.");
					break;
				}

				// Right-click again to bring up the context menu for the next item
				act.contextClick(rightClickElement).build().perform();

				// Optional: Add a short sleep to see the action (not recommended for actual
				// tests)
				Thread.sleep(1000);
			}

			System.out.println("All necessary menu items clicked successfully!");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
