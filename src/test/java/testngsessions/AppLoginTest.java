package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppLoginTest {
	WebDriver driver;

	@BeforeTest
	public void AppLogin() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void titleTest() {
		String titleString = driver.getTitle();
		System.out.println(titleString);
		Assert.assertEquals(titleString,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	}

	@Test
	public void getUrlTest() {
		String getURLString = driver.getCurrentUrl();
		System.out.println(getURLString);
		Assert.assertEquals(getURLString, "https://www.amazon.in/ref=nav_logo");

	}

	@Test
	public void buttonPrentTest() {
		WebElement searcButtonElement = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		System.out.println(searcButtonElement);
		Assert.assertTrue(searcButtonElement.isDisplayed());
	}

	@AfterTest
	public void TearDown() {
		driver.quit();

	}

}
