package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		String filePath = "C:\\Users\\Rakesh.Singh\\Desktop\\ORDERS\\Final\\Yearly_Statement 2021-22.pdf";

		driver.findElement(By.name("upfile")).sendKeys(filePath);

	}
}
