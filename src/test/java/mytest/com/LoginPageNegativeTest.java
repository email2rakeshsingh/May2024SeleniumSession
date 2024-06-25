package mytest.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest {

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] { { "", "" }, // Empty username and password
				{ "email2ra@gmail", "pass" }, // Invalid username and password
				{ "rak@gmail", "" }, // Valid username, empty password
				{ "", "neha@gmail.com" }, // Empty username, valid password
				{ "admin@gmail", "admin" }, // Common default credentials
				{ " ", " " }, // Empty username and password (additional case)
				{ "rak@gmail.com", "" }, // Invalid username, empty password (additional case)
				{ "", "ram@gmail.com" }, // Empty username, invalid password (additional case)
				{ "rakesh@gmail.com	", "email2@gmail.com" } // Random username and password (additional case)
				// Add more negative test cases as needed
		};

	}

	@Test(dataProvider = "getLoginData")
	public void LoginNegativeTest(String userName, String Password) {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();

		System.out.println(text);
		Assert.assertTrue(text.contains(
				"Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour."));

	}

}
