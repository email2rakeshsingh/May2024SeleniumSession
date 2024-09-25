package SeleniumCodePratice;

public interface Util {

	String CHROME_BROWSER = "chrome";
	String fIREFOX_BROWSER = "fIREFOX";
	String sAFARI_BROWSER = "safari";

	public void navigateURL(String url);

	public String getTitle();

	public String getCurrentUrl();

	public String getPageSource();

	public void clearCookies();

}
