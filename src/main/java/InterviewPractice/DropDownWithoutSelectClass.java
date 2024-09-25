package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		List<WebElement> textEs = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));

		System.out.println(textEs.size());

		for (WebElement e : textEs) {

			String textString = e.getText();
			System.out.println(textString);
			if (textString.contains("Brazil")) {
				e.click();
				break;

			}
		}

	}

}
