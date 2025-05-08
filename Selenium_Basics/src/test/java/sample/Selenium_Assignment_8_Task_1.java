package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_Assignment_8_Task_1{
	
	//Johannes Mathelele
	//Selenium_Assignment_8_1
	
	public WebDriver driver;
	
  @Test
  public void testAssignment() throws InterruptedException{
	  
	  
	// Navigate to the playground website
			driver.get("https://www.lambdatest.com/selenium-playground/");
			
			// Store the parent window handle
			String parentWindow = driver.getWindowHandle();
			System.out.println("Parent Window Handle: " + parentWindow);

			// Click on the "Window Popup Modal" link
			driver.findElement(By.xpath("//a[normalize-space()='Window Popup Modal']")).click();
			
			// Click "Follow on Twitter" to open the new window
			driver.findElement(By.xpath("//a[@title='Follow @Lambdatesting on Twitter']")).click();

			// Wait for the new window to open and switch to it
			Set<String> allWindows = driver.getWindowHandles();
			for (String window : allWindows) {
				if (!window.equals(parentWindow)) {
					driver.switchTo().window(window);
					System.out.println("Switched to popup window: " + window);
					break;
				}
			}

			// Close the popup window
			driver.close();
			
			// Switch back to the parent window
			driver.switchTo().window(parentWindow);
			System.out.println("Switched back to parent window: " + parentWindow);

			// Verify that you are back on the parent window and perform an action
			driver.findElement(By.xpath("//img[@alt='Chat Widget']")).click();
			System.out.println("Clicked 'Chat widget.");
	  
	  
	}
	   
  
 
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
