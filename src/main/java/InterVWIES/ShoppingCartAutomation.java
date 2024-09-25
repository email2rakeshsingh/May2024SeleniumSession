package InterVWIES;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartAutomation { 
    public static void main(String[] args) { 
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try { 
            driver.get("http://example.com"); // Replace with actual URL

            // Empty Cart 
            WebElement emptyCartButton = driver.findElement(By.id("emptyCartButton"));
            emptyCartButton.click();

            // Add Product to Cart 
            WebElement product = driver.findElement(By.id("product1"));
            WebElement addButton = product.findElement(By.className("addToCartButton"));
            addButton.click();

            // Find Number Count 
            WebElement cartCount = driver.findElement(By.id("cartCount"));
            System.out.println("Number of items in cart: " + cartCount.getText());
        } finally { 
            driver.quit();
        } 
    } 
}
