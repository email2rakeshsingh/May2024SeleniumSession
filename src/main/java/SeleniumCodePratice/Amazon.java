package SeleniumCodePratice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		Browser_Util util = new Browser_Util();
		util.Init_driver("chrome");
		util.navigateURL("https://www.amazon.in/ref=nav_logo");
		String title = util.getTitle();
		System.out.println(title);
	}

}
