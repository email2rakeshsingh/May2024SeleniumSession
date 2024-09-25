package InterviewPractice;

public interface Util {

	String CHROME_BROWSER = "chrome";
	String fIREFOX_BROWSER = "FIREFOX";

	public void navigateURL(String url);

	public String getTitle();

	public String getPageSouceUrl();

	public String getPageUrl();

	public void closeBrowser();

	public void quitBrowser();

}
