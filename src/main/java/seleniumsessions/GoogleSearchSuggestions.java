package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("naveen automation lab");

		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@class='G43f7e']//li"));
		System.out.println("Total List :" + suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains("naveen automationlabs java")) {

				e.click();
				break;

			}

		}

	}

}
