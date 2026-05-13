package SeleniumCodePratice;

public interface Util {

	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";

	public void navigateURL(String url);

	public String getTitle();

	public String getCurrentUrl();

	public String getPageSource();

	public void clearCookies();

}
