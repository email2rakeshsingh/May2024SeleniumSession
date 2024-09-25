package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));

		String text = driver.findElement(By.xpath("//body/h2[contains(text(), 'Title')][1]")).getText();
		System.out.println(text);

	}

}
