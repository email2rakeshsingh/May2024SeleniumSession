package mytest.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test
	public void googleTitleTest() {
		driver.get("https://www.google.com/");
		String titleString = driver.getTitle();
		System.out.println(titleString);
		Assert.assertEquals(titleString, "Google");
	}

	 @Test
	    public void getCurrentUrlTest() {
	        // Ensure we navigate to Google first
	        driver.get("https://www.google.com");

	        // Get the current URL
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentURL);

	        // Assert that the current URL contains "google"
	        Assert.assertTrue(currentURL.contains("google"), "Current URL does not contain 'google'");
	    }

	@Test
	public void searchTest() {
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		System.out.println(searchBox);
		searchBox.sendKeys("ipad");
		searchBox.submit();

		String titleSCRP = driver.getTitle();
		Assert.assertTrue(titleSCRP.contains("ipad"));

	}

}
