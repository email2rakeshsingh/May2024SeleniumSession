package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		selectFeatureDate("January 2035", "32");

	}

	public static void selectFeatureDate(String expMonth, String NumDate) {

		if (expMonth.contains("February") && Integer.parseInt(NumDate) > 29) {
			System.out.println("Please enter the currect .....date-please pass write day in Feb month  ");
			return;
		}

		if (Integer.parseInt(NumDate) > 31) {
			System.out.println("Please enter the currect .....date-please pass write day ");
			return;
		}

		String actMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actMonthYear);

		while (!actMonthYear.equalsIgnoreCase(expMonth)) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			actMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

		}
		selectDtae(NumDate);

	}

	public static void selectDtae(String dateNum) {
		driver.findElement(By.xpath("//a[normalize-space()='" + dateNum + "']")).click();

	}

}
