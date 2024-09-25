package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

		driver.findElement(By.xpath("//input [@id= 'myFile']"))
				.sendKeys("C:\\Users\\Rakesh.Singh\\Desktop\\INTERVIEWS\\english class.txt");

	}

}
