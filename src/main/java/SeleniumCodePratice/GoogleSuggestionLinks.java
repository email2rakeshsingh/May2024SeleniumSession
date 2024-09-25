package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Rakesh");
		Thread.sleep(3000);

		List<WebElement> searchSugg = driver
				.findElements(By.xpath("//ul[@class='G43f7e']/li//div [@class='wM6W7d']/span"));

		for (WebElement e : searchSugg) {
			String text = e.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("rakesh singh")) {
				e.click();
				break;
			}

		}
	}

}
