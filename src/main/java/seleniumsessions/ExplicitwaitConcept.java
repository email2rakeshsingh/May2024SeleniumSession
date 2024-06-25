package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitwaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// Setup WebDriver and open browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Open the target URL
		driver.get("https://www.amazon.in/ref=nav_logo");

		// Define locators
		By logo = By.xpath("//a[@id='nav-logo-sprites']");
		By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
		By buttonBacktoTop = By.xpath("//span[@class='navFooterBackToTopText']");

//		// Create WebDriverWait object
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		// Wait for logo to be present
//		WebElement ele_logoElement = wait.until(ExpectedConditions.presenceOfElementLocated(logo));
//		if (ele_logoElement.isDisplayed()) {
//			System.out.println("Logo is displayed.");
//		}
//
//		// Wait for search box to be present and send keys
//		WebElement ele_searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
//		ele_searchBox.sendKeys("ipad");
//
//		// Wait for button to be clickable and click
//		WebElement ele_buttonBacktoTop = wait.until(ExpectedConditions.elementToBeClickable(buttonBacktoTop));
//		if (ele_buttonBacktoTop.isDisplayed()) {
//			System.out.println("Button is displayed.");
//			
	}

	public static WebElement waitElementPresent(By locater, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locater));
	}

}
