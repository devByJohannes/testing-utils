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

public class Explicit_Wait_Example {
	
	//Johannes Mathelele
	//Assert True Example
	
	public WebDriver driver;
	
  @Test
  public void testExplicit_Wait_Example() throws InterruptedException{
	  
	  driver.get("https://jquery.com/");
	  
	  driver.findElement(By.linkText("Autocomplete")).click();
	  
	  //switch to frame
	  
	  WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  
	  driver.switchTo().frame(frame);
	  driver.findElement(By.id("tags")).sendKeys("selenium");
	  
	  //come out of the frame
	  
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Button")).click();
	  
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
