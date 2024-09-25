package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUpGrade {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		// Example for future date
		selectDate("January 2035", "15");
		// Example for past date
		// selectDate("December 2020", "15");

	}

	public static void selectDate(String expMonthYear, String day) {

		if (expMonthYear.contains("February") && Integer.parseInt(day) > 29) {
			System.out.println("Please enter a valid date. February cannot have more than 29 days.");
			return;
		}

		if (Integer.parseInt(day) > 31) {
			System.out.println("Please enter a valid date. No month has more than 31 days.");
			return;
		}

		String actMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println("Current displayed month and year: " + actMonthYear);

		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			if (isFutureDate(actMonthYear, expMonthYear)) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			actMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}

		selectDay(day);
	}

	public static boolean isFutureDate(String actMonthYear, String expMonthYear) {
		String[] actParts = actMonthYear.split(" ");
		String[] expParts = expMonthYear.split(" ");
		int actYear = Integer.parseInt(actParts[1]);
		int expYear = Integer.parseInt(expParts[1]);

		if (actYear < expYear) {
			return true;
		} else if (actYear > expYear) {
			return false;
		} else {
			return getMonthIndex(actParts[0]) < getMonthIndex(expParts[0]);
		}
	}

	public static int getMonthIndex(String month) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (int i = 0; i < months.length; i++) {
			if (months[i].equalsIgnoreCase(month)) {
				return i;
			}
		}
		return -1;
	}

	public static void selectDay(String day) {
		driver.findElement(By.xpath("//a[normalize-space()='" + day + "']")).click();
	}
}
