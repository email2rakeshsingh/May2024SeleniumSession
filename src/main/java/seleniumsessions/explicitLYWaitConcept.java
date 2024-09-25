package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitLYWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// Setup WebDriver and open browser

		driver = new ChromeDriver();

		// Open the target URL
		driver.get("https://www.amazon.in/ref=nav_logo");

		// Define locators
		By logo = By.xpath("//a[@id='nav-logo-sprites']");
		By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
		By buttonBacktoTop = By.xpath("//span[@class='navFooterBackToTopText']");
		By accountList = By.xpath("//a[@id='nav-link-accountList']");
		By cart = By.xpath("//a[@id='nav-cart']");
		By footerLinks = By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a");

		// Create WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Check for the logo
		WebElement ele_logoElement = wait.until(ExpectedConditions.presenceOfElementLocated(logo));
		if (ele_logoElement.isDisplayed()) {
			System.out.println("Logo is displayed.");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
		wait.until(ExpectedConditions.elementToBeClickable(logo));

		// Check for the search box
		WebElement ele_searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
		ele_searchBox.sendKeys("ipad");
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
		wait.until(ExpectedConditions.elementToBeClickable(searchBox));

		// Check for the "Back to Top" button
		WebElement ele_buttonBacktoTop = wait.until(ExpectedConditions.presenceOfElementLocated(buttonBacktoTop));
		if (ele_buttonBacktoTop.isDisplayed()) {
			System.out.println("Back to Top button is displayed.");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonBacktoTop));
		wait.until(ExpectedConditions.elementToBeClickable(buttonBacktoTop));

		// Check for the cart link
		WebElement ele_cart = wait.until(ExpectedConditions.presenceOfElementLocated(cart));
		if (ele_cart.isDisplayed()) {
			System.out.println("Cart is displayed.");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
		wait.until(ExpectedConditions.elementToBeClickable(cart));

		// Check for the footer links
		WebElement ele_footerLinks = wait.until(ExpectedConditions.presenceOfElementLocated(footerLinks));
		if (ele_footerLinks.isDisplayed()) {
			System.out.println("Footer links are displayed.");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(footerLinks));
		wait.until(ExpectedConditions.elementToBeClickable(footerLinks));

		// Perform actions
		ele_buttonBacktoTop.click();
		ele_cart.click();

	}
}
