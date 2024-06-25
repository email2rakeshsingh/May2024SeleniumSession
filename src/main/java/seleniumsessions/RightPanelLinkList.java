package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPanelLinkList {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By rightPnal = By.xpath("//aside [@ id='column-right']//a");
//		By CountList = By.xpath("//aside [@ id='column-right']//a");
//		printAllElementText(rightPnal);
//		System.out.println(getElementCount(CountList));

		List<String> actElementList = getElementsListText(rightPnal);
		System.out.println(actElementList);
		
		if (actElementList.contains("Register")) {
			System.out.println("PASS");
			
		}
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.getElementFromSections(rightPnal, "Register");

	}

	public static int getElementCount(By string) {
		return driver.findElements(string).size();
	}

	public static List<String> getElementsListText(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);

		}
		return eleTextList;

	}

	public static void printAllElementText(By locater) {
		List<WebElement> eleList = driver.findElements(locater);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);

		}

	}

}
