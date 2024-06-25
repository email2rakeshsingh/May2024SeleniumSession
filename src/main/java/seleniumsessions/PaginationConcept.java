package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class PaginationConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Russia']")).size() > 0) {
				selctCityByRelative("Russia");
				break;

			} else {
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over.....city is not found");
					break;
				}
				next.click();
				Thread.sleep(5000);

			}

		}

	}

	public static void getCityName(String cityName) {
		String xpathString = "//td[text()='" + cityName + "']//preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpathString)).click();

	}

	public static void selctCityByRelative(String name) {
		WebElement element = driver.findElement(By.xpath("//td[text()='"+ name +"']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(element)).click();

	}
}
