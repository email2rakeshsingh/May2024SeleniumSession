package SeleniumCodePratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		By images = By.tagName("img");
		By links = By.tagName("a");

		int linkSize = getSize(links);
		int imgesSixe = getSize(images);
		System.out.println(linkSize + " : " + imgesSixe);

//		List<WebElement> imgaes = driver.findElements(By.tagName("img"));
//		System.out.println(imgaes.size());
//
//		for (WebElement e : imgaes) {
//			String Text = e.getText();
//			String attr = e.getAttribute("src");
//			System.out.println(Text + " " + attr);
//
//		}

	}

	public static int getSize(By locater) {
		return getElements(locater).size();

	}

	public static List<WebElement> getElements(By locater) {
		return driver.findElements(locater);

	}

}
