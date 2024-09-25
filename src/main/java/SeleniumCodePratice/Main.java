package SeleniumCodePratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Open the parent window
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String parentWindow = driver.getWindowHandle();

		// Open and close the first child window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.linkedin.com/groups/?home=&gid=891077");
		System.out.println(driver.getTitle());
		driver.close(); // Close the first child window

		// Switch back to the parent window
		driver.switchTo().window(parentWindow);

		// Open and close the second child window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/OrangeHRM");
		System.out.println(driver.getTitle());
		driver.close(); // Close the second child window

		// Switch back to the parent window
		driver.switchTo().window(parentWindow);

		// Open and close the third child window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://x.com/orangehrm");
		System.out.println(driver.getTitle());
		driver.close(); // Close the third child window

		// Switch back to the parent window
		driver.switchTo().window(parentWindow);

		// Open and close the fourth child window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/orangehrm");
		System.out.println(driver.getTitle());
		driver.close(); // Close the fourth child window

		// Switch back to the parent window
		driver.switchTo().window(parentWindow);

		// The parent window remains open
		System.out.println("Parent window title: " + driver.getTitle());

		// Optionally, you can close the driver at the end
		driver.quit();
	}
}
