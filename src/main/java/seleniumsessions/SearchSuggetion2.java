package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggetion2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(9000);

		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(), 'Casual Dresses > Printed ')]"))
				.click();

	}

}
