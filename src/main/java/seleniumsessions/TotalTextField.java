package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextField {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By textName = By.className("form-control");
		ElementUtil textCount = new ElementUtil(driver);
		int Name = textCount.getElementCount(textName);
		System.out.println(Name);

	}
}
