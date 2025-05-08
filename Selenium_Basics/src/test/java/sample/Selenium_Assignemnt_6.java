package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Selenium_Assignemnt_6 {

	//Johannes Mathelele
	//Selenium Assignment 6
	
    public WebDriver driver;

    @Test
    public void seleniumAssignment_Example() throws InterruptedException {
       
        driver.get("https://the-internet.herokuapp.com/");
        
        WebElement uploadLink = driver.findElement(By.xpath("//a[normalize-space()='File Upload']"));
        uploadLink.click();

        WebElement fileInput = driver.findElement(By.id("file-upload"));
        
        String filePath = "C:\\Users\\Thapelo\\Documents\\erisnLms work\\TESTING\\testimg.txt";  // Include filename
        fileInput.sendKeys(filePath);

      
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

       
        WebElement successMessage = driver.findElement(By.tagName("h3"));
        if (successMessage.getText().equals("File Uploaded!")) {
            System.out.println("Test passed: File uploaded successfully.");
        } else {
            System.out.println("Test failed: Upload confirmation message not found.");
        }
    }
    
    @BeforeClass
    public void beforeClass() {
        // Set the path to your WebDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application");

        // Initialize the WebDriver and configure it
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void afterClass() {
        // Close the browser after the test
    	
    	// driver.quit();
       
    }
}
