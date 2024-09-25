package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FliCartSVG {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.className("Pke_EE")).sendKeys("Mobile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();
	}

}
