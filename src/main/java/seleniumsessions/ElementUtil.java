package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doActionsSendKeys(By locater, String values) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locater), values).perform();

	}

	public

		void doActionsClick(By locater) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locater)).perform();

	}

	public void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

	public WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

	public void getErrorMessge(By locator) {
		getElement(locator).getText();

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);

	}

	public boolean doisDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public int getElementCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void getElementFromSections(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;
			}
		}

	}

	public int getElementListCount(By locater) {
		return getElements(locater).size();
	}

	public List<String> getElementsListText(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);

		}
		return eleTextList;

	}

	public void printAllElementText(By locater) {
		List<WebElement> eleList = getElements(locater);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);

		}
	}
	// **********************MyDropDownUtils**********************

	public void doSelectDropDownIndex(By locater, int Index) {
		Select select = new Select(getElement(locater));
		select.selectByIndex(Index);

	}

	public void doSelectDropDownbyVisibleText(By locater, String visibleText) {
		Select select = new Select(getElement(locater));
		select.selectByVisibleText(visibleText);

	}

	public void doSelectDropDownbyValue(By locater, String value) {
		Select select = new Select(getElement(locater));
		select.selectByValue(value);

	}

	public int dropDownValuesCount(By locater) {
		return getElements(locater).size();

	}

	public List<String> getSelectDropDownValuesList(By locater) {
		List<String> valueList = new ArrayList<String>();
		Select select = new Select(getElement(locater));
		List<WebElement> optionList = select.getOptions();
		for (WebElement e : optionList) {
			String text = e.getText();
			valueList.add(text);

		}
		return valueList;

	}

	public void selectValuesFromSelectDropdown(By locater, String value) {
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

	public void withoutSelectvaluesinDropdown(By locater, String value) {
		List<WebElement> dropDownVal = getElements(locater);
		System.out.println(dropDownVal.size());

		for (WebElement e : dropDownVal) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;

			}
		}
	}
}
