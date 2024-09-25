package Interviws_TESCO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FacebookSearch {
    public static void main(String[] args) {
        // Set the WebDriver path (make sure the path to chromedriver is correct)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Open Facebook (Assuming you're already logged in)
        driver.get("https://www.facebook.com");
        
        // Find the search box and enter "Rakesh Kumar Singh"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Rakesh Kumar Singh");
        searchBox.submit(); // Submit search
        
        // Add a delay to wait for the search results to load (You can use explicit waits instead)
        try {
            Thread.sleep(3000); // This is a simple delay; replace with WebDriverWait for real-world use
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find all search results (Assuming results have a common class, replace with actual HTML structure)
        List<WebElement> searchResults = driver.findElements(By.xpath("//div[contains(@class, 'search-result')]"));
        
        // Loop through the search results and find "Rakesh Kumar Singh Wipro"
        for (WebElement result : searchResults) {
            String resultText = result.getText();  // Get the text of each search result
            
            // Check if the result contains both "Rakesh Kumar Singh" and "Wipro"
            if (resultText.contains("Rakesh Kumar Singh") && resultText.contains("Wipro")) {
                // Click the correct result if it matches
                result.click();
                break;  // Stop after finding the correct result
            }
        }

        // Close the browser after the action (you can keep it open for further actions)
        // driver.quit();
    }
}
