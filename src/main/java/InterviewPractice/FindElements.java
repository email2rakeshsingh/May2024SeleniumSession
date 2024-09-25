package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());

//		for (int i = 0; i <= linkList.size(); i++) {
//
//			String textString = linkList.get(i).getText();
//			System.out.println(textString);
//
//			if (!textString.isEmpty()) {
//				System.out.println(textString);
//			}

		// For each loop

		for (WebElement e : linkList) {

			String text = e.getText();
			String href = e.getAttribute("href");

			if (!text.isEmpty()) {
				System.out.println(text + " " + href);

			}
		}
	}

}
