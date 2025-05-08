package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class MultiSelect_Example {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	
	public WebDriver driver;
	
  @Test
  public void tetRadio_Example() throws InterruptedException {
	  
	  driver.get("http://www.tizag.com/htmlT/htmlselect.php");
	  
	  WebElement dd = driver.findElement(By.xpath("(//select[@name='selectionField'])[2]"));
	  
	  //Create an object for select class
	  Select s = new Select(dd);
	 
	  s.selectByIndex(0);
	  Thread.sleep(2000);
	  
	  s.selectByValue("CO");
	  Thread.sleep(2000);
	  
	  s.selectByVisibleText("Connecticut -- CN");
	  Thread.sleep(2000);
	  
	  s.deselectByIndex(0);
	  Thread.sleep(2000);
	  
	  s.deselectAll();
	  
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
