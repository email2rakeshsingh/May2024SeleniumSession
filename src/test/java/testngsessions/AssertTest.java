package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver (e.g., ChromeDriver)
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testExample() {
        // Assert the page title
        String title = driver.getTitle();
        Assert.assertEquals(title, "Register Account");

        // Assert the URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("route=account/register"));

        // Find an element and assert its text
        WebElement heading = driver.findElement(By.cssSelector("div#content h1"));
        String headingText = heading.getText();
        Assert.assertEquals(headingText, "Register Account");

        // Assert an element's attribute
        WebElement inputField = driver.findElement(By.id("input-firstname"));
        String placeholder = inputField.getAttribute("placeholder");
        Assert.assertEquals(placeholder, "First Name");

        // Assert an element's visibility
        WebElement button = driver.findElement(By.cssSelector("input[type='submit']"));
        Assert.assertTrue(button.isDisplayed());
        Assert.assertTrue(button.isEnabled());

        // Assert a checkbox is selected
        WebElement checkbox = driver.findElement(By.name("agree"));
        checkbox.click();  // Ensure checkbox is selected
        Assert.assertTrue(checkbox.isSelected());
    }
}
