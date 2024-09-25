package SeleniumCodePratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
 
	}

	public void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);

	}

	public WebElement getElement(By locater) {
		return driver.findElement(locater);

	}
}
