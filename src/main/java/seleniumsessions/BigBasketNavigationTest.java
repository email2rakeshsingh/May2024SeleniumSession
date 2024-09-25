package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketNavigationTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/auth/login/?nc=close");

		WebElement mainElement = driver.findElement(By.cssSelector(".meganav-shop.dropdown-toggle"));

		Actions act = new Actions(driver);
		act.moveToElement(mainElement).perform();
		Thread.sleep(4000);

		act.moveToElement(driver.findElement(By.cssSelector(".ng-binding.active"))).perform();
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.linkText("Tea"))).perform();
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.linkText("Green Tea"))).click();

	}

}
