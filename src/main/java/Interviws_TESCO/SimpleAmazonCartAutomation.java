package Interviws_TESCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAmazonCartAutomation {
	public static void main(String[] args) {
		// Set path for the ChromeDriver

		// Update with your chromedriver path

		WebDriver driver = new ChromeDriver();

		try {
			// Step 1: Open Amazon homepage
			driver.get("https://www.amazon.com/");

			// Step 2: Search for a product (e.g., "laptop")
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
			driver.findElement(By.id("nav-search-submit-button")).click();

			// Step 3: Click on the first product
			driver.findElement(By.cssSelector(".s-main-slot .s-result-item")).click();

			// Step 4: Add the product to the cart
			driver.findElement(By.id("add-to-cart-button")).click();

			// Step 5: Retrieve the cart count
			WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
			System.out.println("Number of items in the cart: " + cartCount.getText());

			// Step 6: Go to the cart page
			driver.findElement(By.id("nav-cart")).click();

			// Step 7: Remove the item from the cart (assuming only one item)
			driver.findElement(By.xpath("//input[@value='Delete']")).click();

			System.out.println("Item removed from the cart.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
