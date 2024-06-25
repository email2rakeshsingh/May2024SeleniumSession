package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");

		// driver.switchTo().frame("pact");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pizzaElement = (WebElement) js.executeScript(
				"return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");");

		pizzaElement.sendKeys("Rakesh");

	}
}
