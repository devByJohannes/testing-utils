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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_Assignment_8_Task_2{
	
	//Johannes Mathelele
	//Selenium_Assignment_8_Task_2
	
	public WebDriver driver;
	
  @Test
  public void testAssignment() throws InterruptedException{
	  
	  
	  		// Navigate to the playground website
			driver.get("https://jqueryui.com/");
			
			
			driver.findElement(By.xpath("//a[normalize-space()='Droppable']")).click();
			
			// Locate the draggable and droppable elements by their IDs
			
	        WebElement drag1 = driver.findElement(By.id("draggable"));
	        WebElement drop = driver.findElement(By.id("droppable"));

	        // Perform drag and drop action
	        Actions a = new Actions(driver);
	        a.dragAndDrop(drag1, drop).build().perform();
	  
			
	  
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
