package seleniumsessions;

import org.apache.commons.codec.language.bm.Rule;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.init_driver("edge");
		brUtil.navigateUrl("https://www.amazon.in/");
		String title = brUtil.getPageTitle();
		System.out.println(title);

		if (title.contains("Online")) {
			System.out.println("correct title");

		} else {
			System.out.println("incorrect title");
		}

		String url = brUtil.getPageUrl();
		System.out.println(url.contains("https://www.amazon.in/"));

		System.out.println(brUtil.getPageSource().contains("Amazon Pay on Merchants"));

		brUtil.closeBrowser();

	}

}
