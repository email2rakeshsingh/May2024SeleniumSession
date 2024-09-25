package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());

		for (WebElement e : img) {

			String srcString = e.getAttribute("src");
			String htmlString = e.getAttribute("HTML");
			System.out.println(srcString);
			System.out.println(htmlString);

		}

	}

}
