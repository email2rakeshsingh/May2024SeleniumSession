package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmSignUp {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.orangehrm.com/en/book-a-free-demo");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		By FullName = By.id("Form_getForm_FullName");
		By Email = By.id("Form_getForm_Email");
		By Contact = By.id("Form_getForm_Contact");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(FullName, "Rakesh Kumar Singh");
		eleUtil.doSendKeys(Email, "email2rakeshsingh@gmail.com");
		eleUtil.doSendKeys(Contact, "90368952");

	}

}
