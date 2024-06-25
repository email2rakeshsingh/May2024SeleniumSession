package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class MultipleElements {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total Link is page :" + linkList.size());

////		for (int i = 0; i < linkList.size(); i++) {
////			String text = linkList.get(i).getText();
////			String href = linkList.get(i).getAttribute("href");
////			if (!text.isEmpty()) {
////				System.out.println(text + ":" + href);
////
////			}
//
//		}

//		for each loop 

		for (WebElement e : linkList) {
			String text = e.getText();
			String href = e.getAttribute("href");
			if (!text.isEmpty()) {
				System.out.println(text + ":" + href);

			}

		}

	}
}
