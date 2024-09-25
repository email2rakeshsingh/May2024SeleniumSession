package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Actions act = new Actions(driver);

		WebElement draggablE = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(8000);
//		act
//		.clickAndHold(draggablE)
//		  .moveToElement(droppable)
//		     .release()
//		       .build()
//		         .perform();

		act.dragAndDrop(draggablE, droppable).build().perform();
	}

}
