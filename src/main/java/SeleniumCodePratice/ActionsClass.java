package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://dribbble.com/tags/mouse-over");

		WebElement mainPoint = driver.findElement(By.xpath("//a[text()='Find designers']"));

		Actions act = new Actions(driver);
		act.moveToElement(mainPoint).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]"))
				.click();
	}

}
