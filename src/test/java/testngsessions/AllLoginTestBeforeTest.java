package testngsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AllLoginTestBeforeTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	}

	@Test
	public void getCurrentURL() {
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		Assert.assertEquals(CurrentUrl, "https://www.amazon.in/ref=nav_logo");

	}

	@Test
	public void SearchButton() {
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		System.out.println(searchButton);
		Assert.assertTrue(searchButton.isDisplayed());

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
