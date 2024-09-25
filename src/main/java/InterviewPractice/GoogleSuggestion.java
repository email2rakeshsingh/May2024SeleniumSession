package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("naveen automation");
		Thread.sleep(10000);

		List<WebElement> searchBox = driver
				.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));

		System.out.println(searchBox.size());

		for (WebElement element : searchBox) {
			String text = element.getText();
			System.out.println(text);
			if (text.contains("naveen automationlabs reviews")) {

				element.click();
				break;

			}
		}

	}

}
