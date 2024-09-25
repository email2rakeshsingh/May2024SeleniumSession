package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.orangehrm.com/en/contact-sales/?_gl=1*ti1kme*_up*MQ..*_ga*MTY2MjE5ODQ1NC4xNzE2NjI4OTc3*_ga_6C6T9MXTRT*MTcxNjYyODk3Ny4xLjAuMTcxNjYyODk3Ny4wLjAuMTY5OTk3ODI4NQ..");

		By CountryName = By.id("Form_getForm_Country");

//		if (getSelectDropDownValuesList(CountryName).contains("India")) {
//			System.out.println("pass");
//
//		}

		List<String> countryList = getSelectDropDownValuesList(CountryName);
		if (countryList.contains("India"))
			System.out.println("Pass");
		if (countryList.contains("Algeria"))
			System.out.println("Pass");
		if (countryList.contains("Bahrain"))
			System.out.println("Pass");
//		selectValuesFromSelectDropdown(CountryName, "Guam");
		// printSelectDropdownValues(CountryName);
//		Select select = new Select(driver.findElement(CountryName));
//
//		List<WebElement> dropdown = select.getOptions();
//		System.out.println(dropdown.size());
//
//		for (WebElement e : dropdown) {
//			String textValS = e.getText();
//			System.out.println(textValS);
//			if (textValS.equals("Yemen")) {
////				System.out.println("Test is pass");
////				break;
//				e.click();
//				break;
//			}
////			utility for select values from drop down 
//
//		}

	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static List<WebElement> getElements(By locater) {
		return driver.findElements(locater);

	}

	public static int dropDownValuesCount(By locater) {
		return getElements(locater).size();

	}

	public static List<String> getSelectDropDownValuesList(By locater) {
		List<String> valueList = new ArrayList<String>();
		Select select = new Select(getElement(locater));
		List<WebElement> optionList = select.getOptions();
		for (WebElement e : optionList) {
			String text = e.getText();
			valueList.add(text);

		}
		return valueList;

	}

	public static void selectValuesFromSelectDropdown(By locater, String value) {
		Select select = new Select(getElement(locater));
		List<WebElement> dropdown = select.getOptions();
		for (WebElement e : dropdown) {
			String text = e.getText();
			if (text.contains(value)) {
				e.click();
				break;

			}

		}

	}

	public static void printSelectDropdownValues(By locater) {
		Select select = new Select(getElement(locater));

		List<WebElement> dropdown = select.getOptions();

		for (WebElement e : dropdown) {
			String textValS = e.getText();
			System.out.println(textValS);

		}
	}
}
