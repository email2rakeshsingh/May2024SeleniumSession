package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocater {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://whenwise.com/");

		WebElement button = driver.findElement(By.xpath("//input[@id='search']"));

		driver.findElement(with(By.xpath("//input[@id='find-business-btn']")).toRightOf(button)).click();

	}

}
