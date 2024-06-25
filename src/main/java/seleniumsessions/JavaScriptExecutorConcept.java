package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		// script -- java
		// browser --> JS
		// JS code -- with selenium + java -- JSExecutor

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);



	}

}