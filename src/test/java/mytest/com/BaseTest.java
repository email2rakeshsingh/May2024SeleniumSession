package mytest.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setup(String browserName, String AppUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("please pass the write browser " + browserName);
		}

		driver.get(AppUrl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
