package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.radians;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/vitality-blast-2024-1410370/lancashire-vs-derbyshire-north-group-1410388/full-scorecard");
//		System.out.println(wik_TakerName("Luke Wells"));
//		System.out.println(wik_TakerName("Luke Wood"));
		System.out.println(getPlayerScoreList("Tom Aspinwall"));
		System.out.println(getPlayerScoreList("Chris Green "));
		System.out.println(getPlayerScoreList("Luke Wood"));
	}

	public static String wik_TakerName(String name) {
		String xpath = "//span[contains(text(), '" + name + "')]/ancestor::td/following-sibling::td";
		return driver.findElement(By.xpath(xpath)).getText();

	}

	public static List<String> getPlayerScoreList(String name) {
		String xPath = "//span[contains(text (),'" + name + "')]/ancestor::td/following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(xPath));
		List<String> addList = new ArrayList<String>();
		for (WebElement e : scoreList) {

			String text = e.getText();
			addList.add(text);

		}
		return addList;

	}

}
