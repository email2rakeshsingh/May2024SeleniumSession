package SeleniumCodePratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDdrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Actions act = new Actions(driver);

		WebElement dreag = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));

		act.clickAndHold(dreag).moveToElement(dropElement).release().build().perform();

		// act.dragAndDrop(dreag, dropElement).perform();

	}

}
