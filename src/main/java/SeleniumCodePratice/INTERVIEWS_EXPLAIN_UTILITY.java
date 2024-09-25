package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class INTERVIEWS_EXPLAIN_UTILITY {

	public static void main(String[] args) {

		Browser_Util browser = new Browser_Util();

		WebDriver driver = browser.Init_driver("chrome");
		browser.navigateURL("https://www.orangehrm.com/es/contact-sales/");
		browser.getTitle();
		browser.getCurrentUrl();
		browser.getPageSource();

		// OR / bY Locater

		By fullName = By.id("Form_getForm_FullName");
		By Phonenumber = By.id("Form_getForm_Contact");
		By emailBy = By.id("Form_getForm_Email");

		ElementUtil elementUtil = new ElementUtil(driver);
		elementUtil.doSendKey(fullName, "Rakesh kumar singh");
		elementUtil.doSendKey(Phonenumber, "9039014433");
		elementUtil.doSendKey(emailBy, "email2rakeshsingh@gmail.com");

	}

}
