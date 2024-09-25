package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		ElementUtil amazon = new ElementUtil(driver);
		By searchDrop = By.id("searchDropdownBox");
		// amazon.doSelectDropDownIndex(searchDrop, 5);
		Thread.sleep(5000);
		// amazon.dropDownValuesCount(searchDrop);
		amazon.selectValuesFromSelectDropdown(searchDrop, "Baby");
	}

}
