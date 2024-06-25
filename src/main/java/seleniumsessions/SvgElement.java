package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://petdiseasealerts.org/forecast-map#/");

		// Sleep for a few seconds to allow the page to load
		Thread.sleep(5000);

		// Switch to the iframe
		driver.switchTo().frame(0);

		// Find the elements inside the iframe
		List<WebElement> statesList = driver.findElements(By
				.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));

		// Output the number of elements found
		System.out.println("Number of states: " + statesList.size());

		// Scroll halfway down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight / 4)");

		// Use Actions to perform actions on elements
		Actions actions = new Actions(driver);
		for (WebElement e : statesList) {
		
				actions.moveToElement(e).perform();
				String name = e.getAttribute("name");
				System.out.println(name);

			
			}
		}

	}

