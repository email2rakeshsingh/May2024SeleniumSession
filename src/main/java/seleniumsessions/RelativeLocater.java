package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocater {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://whenwise.com/");

		WebElement button = driver.findElement(By.xpath("//input[@id='search']"));
		
		driver.findElement(with(By.xpath("//input[@id='find-business-btn']")).toRightOf(button)).click();
		
		
	}

}
