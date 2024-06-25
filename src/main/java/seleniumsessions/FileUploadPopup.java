package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		String filePath = "C:\\Users\\Rakesh.Singh\\Desktop\\ORDERS\\Final\\Yearly_Statement 2021-22.pdf";

		driver.findElement(By.name("upfile")).sendKeys(filePath);

	}
}
