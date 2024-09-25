package InterviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Util implements Util {

	WebDriver driver;

	// Chross browser logic

	public WebDriver init_driver(String Browser_Name) {

		System.out.println("Browser name is :" + Browser_Name);

		if (Browser_Name.equalsIgnoreCase(CHROME_BROWSER)) {
			driver = new ChromeDriver();

		} else if (Browser_Name.equalsIgnoreCase(fIREFOX_BROWSER)) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("Please write the correct browser name :" + Browser_Name);
		}
		return driver;
	}

	@Override
	public String getTitle() {
		return driver.getTitle();

	}

	@Override
	public String getPageSouceUrl() {
		return driver.getPageSource();

	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();

	}

	@Override
	public void closeBrowser() {
		driver.close();

	}

	@Override
	public void quitBrowser() {
		driver.quit();

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
