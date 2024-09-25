package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksAmazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		System.out.println(allLink.size());

//		for (int i = 0; i <allLink.size(); i++) {
//			String liString = allLink.get(i).getText();
//			if (!liString.isEmpty()) {
//				System.out.println("Not blank string:" + liString);
//			}

		for (WebElement e : allLink) {
			String text = e.getText();
			String attr = e.getAttribute("href");
			System.out.println(text + " " + attr);

		}

	}

}
