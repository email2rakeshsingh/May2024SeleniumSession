package InterviewPractice;

public class AmazonTest {

	public static void main(String[] args) {

		Browser_Util browser = new Browser_Util();
		browser.init_driver("Chrome");
		browser.navigateURL("https://www.amazon.in/ref=nav_logo");

		String amazonTitle = browser.getTitle();
		System.out.println(amazonTitle);

		String pageSou = browser.getPageSouceUrl();
		System.out.println(pageSou);

	}

}
