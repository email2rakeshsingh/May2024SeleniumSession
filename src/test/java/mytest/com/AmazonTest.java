package mytest.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest {

	@Test
	public void AmazonHomePageTitle() {
		driver.get("https://www.amazon.in/ref=nav_logo");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Amazon"));

	}

	@Test
	public void SearchFunctionality() {
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("laptop");
		search.submit();
		String serpTitle = driver.getTitle();
		System.out.println(serpTitle);
		Assert.assertTrue(serpTitle.contains("laptop"));
	}

	@Test
	public void addToCard() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone13");
		searchBox.submit();
		driver.get(
				"https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.OCoJgZ8ghdguKvc7Ozmt3I6QhdUM8D-7qIexwo-q7HfxW-LMajpl3wZliCwXbdvGvN5aaMvXEJDLoKGFyNbH82v8MpesW_5LMz1ADpMDUYWTNpQJNH6y6tWIy4IUoVCM-STnuWiCWyIFPIn7YxzeZ0pw32xy9V5t4onGrX84Bgu02cWMPSkkAvFgz1Icavhw5MfwhmpDwaMy_dH716pPw6sd--qJmGbcqKbqHN_XH3A.CYEKjAzH8p27kgw-BPo7RzEaOvGGm4lNy4qec2U9U-Y&dib_tag=se&keywords=iphone+13&qid=1718030693&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		WebElement addCartElement = driver.findElement(
				By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
		System.out.println(addCartElement);
		addCartElement.click();
		String addCartTitle = driver.getTitle();
		System.out.println(addCartTitle);
		Assert.assertTrue(addCartTitle.contains("Apple "));
	
	}

}
