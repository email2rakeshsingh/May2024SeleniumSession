package seleniumsessions;

public interface Util {

	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String EDGE_BROWSER = "edge";

	public void navigateUrl(String url);

	public String getPageTitle();

	public String getPageUrl();

	public String getPageSource();

	public void closeBrowser();

	public void quitBrowser();

}
