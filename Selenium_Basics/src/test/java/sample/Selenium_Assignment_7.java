package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_Assignment_7{
	
	//Johannes Mathelele
	//Selenium_Assignment_7
	
	public WebDriver driver;
	
  @Test
  public void testAssignment() throws InterruptedException{
	  
	  
	  driver.get("https://www.lambdatest.com/selenium-playground/");
	  driver.findElement(By.xpath("//a[normalize-space()='iFrame Demo']")).click();
	  
	   
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  
      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));
      

      WebElement inputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='rsw-ce']")));  // Adjust selector if needed
      inputBox.sendKeys("text box");
     
     
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
