package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchSuggetion {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
		Thread.sleep(4000);

		List<WebElement> AmazonList = driver.findElements(By.xpath(
				"//div[contains(@class, 'two-pane-results-container')]//div[contains(@class, 's-suggestion-container')]\r\n"
						+ ""));
		System.out.println("Search suggetion values :" + AmazonList.size());

		for (WebElement e : AmazonList) {
			String textVal = e.getText();
			System.out.println(textVal);

			if (textVal.contains("bookmarks")) {
				e.click();
				break;

			}

		}

	}

}
