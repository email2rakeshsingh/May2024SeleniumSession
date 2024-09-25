package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/india");
		Thread.sleep(8000);
		WebElement ele = driver.findElement(By.linkText("Bali, India"));

		String textString = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(textString);

		String leftString = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftString);

		String belowString = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowString);

		String avobeString = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(avobeString);

		String nearString = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(nearString);
	}

}
