package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By searchDropdownBox = By.id("Form_getForm_Country");
		By empNumber = By.id("Form_getForm_NoOfEmployees");

//		doSelectDropDownByIndex(searchDropdownBox, 5);
//		doSelectDropDownByIndex(empNumber, 4);
		doSelectDropdownByVisibleTest(empNumber, "Algeria");

//        WebElement countryElement = driver.findElement(searchDropdownBox);
//        WebElement empNumberElement = driver.findElement(empNumber);
//
//        Select select = new Select(countryElement);
//        select.selectByIndex(5);
//        //select.deselectByVisibleText("Algeria");

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static void doSelectDropDownByIndex(By locater, int index) {
		Select select = new Select(getElement(locater));
		select.selectByIndex(5);

	}

	public static void doSelectDropdownByVisibleTest(By locater, String visibleText) {
		Select select = new Select(getElement(locater));
		select.deselectByVisibleText(visibleText);

	}

}
