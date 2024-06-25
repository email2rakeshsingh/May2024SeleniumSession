package mytest.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AskApplication extends BaseTest {

	@Test
	public void ValidInputSearchTest() throws InterruptedException {
		driver.get("https://www.fromdoctopdf.com/");

		// Wait for the iframe to be present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement iframeElement = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector("iframe[src*='hp.myway.com/fromdoctopdf/ttab02chr']")));

		// Switch to the iframe
		driver.switchTo().frame(iframeElement);

		// Locate the search input element within the iframe
		WebElement searchElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='search-input-container']//input[@type='search']")));

		// Enter a valid search query
		searchElement.sendKeys("ipad");
		Thread.sleep(5000);

		// Locate and click the search button
		WebElement searchbutton1 = driver.findElement(By.cssSelector(".search-button-label"));
		searchbutton1.click();

		// Wait for the results to load
		try {
			Thread.sleep(2000); // You can replace this with a WebDriverWait for the search results to appear
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify that search results are displayed
		java.util.List<WebElement> results = driver
				.findElements(By.xpath("(//img[@src='/static/logos/myway.com.svg'])[1]"));

		System.out.println(results);

	}

	@Test
	public void dynamicChiclet() {
		WebElement chiclet = driver.findElement(By.xpath("//img[@title='Amazon']"));
		System.out.println(chiclet);
		Assert.assertTrue(chiclet.isDisplayed(), "Element is not displayed");

	}

	@Test
	public void showHideButtonTest() {
		WebElement buttElement = driver.findElement(By.xpath("//div[@class='show-hide-toggle']"));
		System.out.println(buttElement);
		Assert.assertTrue(buttElement.isDisplayed(), "Show/Hide Button is appers");
	}

}
