package SeleniumCodePratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser_Util implements Util {

	WebDriver driver;

	public WebDriver Init_driver(String Browsername) {

		System.out.println(Browsername);
		if (Browsername == null || Browsername.trim().isEmpty()) {
			System.out.println("Please enter a non-empty browser name.");
			return null;
		}

		if (Browsername.equalsIgnoreCase(CHROME_BROWSER)) {
			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase(FIREFOX_BROWSER)) {
			driver = new FirefoxDriver();

		} else if (Browsername.equalsIgnoreCase(SAFARI_BROWSER)) {
			driver = new SafariDriver();

		} else {
			System.out.println("Please enter the correct browser name :" + Browsername);
		}
		return driver;

	}

	@Override
	public String getTitle() {
		return driver.getTitle();

	}

	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();

	}

	@Override
	public void clearCookies() {
		driver.manage().deleteAllCookies();

	}

	@Override
	public void navigateURL(String url) {
		if (url == null) {
			return;

		}
		if (url.isEmpty()) {
			return;
		}

		driver.get(url);

	}
}
