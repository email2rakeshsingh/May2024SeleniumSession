package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		// script -- java
		// browser --> JS
		// JS code -- with selenium + java -- JSExecutor

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);

	}

}