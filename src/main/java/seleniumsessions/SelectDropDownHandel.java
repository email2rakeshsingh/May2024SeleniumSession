package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandel {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.orangehrm.com/en/contact-sales/?_gl=1*ti1kme*_up*MQ..*_ga*MTY2MjE5ODQ1NC4xNzE2NjI4OTc3*_ga_6C6T9MXTRT*MTcxNjYyODk3Ny4xLjAuMTcxNjYyODk3Ny4wLjAuMTY5OTk3ODI4NQ..");

		By Country = By.id("Form_getForm_Country");
		By numberOfEmp = By.id("Form_getForm_NoOfEmployees");
		doSelectDropDownIndex(Country, 5);
		doSelectDropDownIndex(numberOfEmp, 5);
		doSelectDropDownbyValue(Country, "Zaire");
		doSelectDropDownbyVisibleText(Country, "Nepal");
		doSelectDropDownIndex(numberOfEmp, 20);

//		WebElement country_Ele = driver.findElement(Country);
//		WebElement number_emp = driver.findElement(numberOfEmp);
//
//		Select select = new Select(country_Ele);
////		select.selectByIndex(5);
////		select.selectByValue("Guam");
//		select.selectByVisibleText("Zaire");
//		Thread.sleep(4000);
//		Select select1 = new Select(number_emp);
//		select1.selectByIndex(5);
	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static void doSelectDropDownIndex(By locater, int Index) {
		Select select = new Select(getElement(locater));
		select.selectByIndex(Index);

	}

	public static void doSelectDropDownbyVisibleText(By locater, String visibleText) {
		Select select = new Select(getElement(locater));
		select.selectByVisibleText(visibleText);

	}

	public static void doSelectDropDownbyValue(By locater, String value) {
		Select select = new Select(getElement(locater));
		select.selectByValue(value);

	}
}
