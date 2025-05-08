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

public class Iframes_Example {
	
	//Johannes Mathelele
	//Assert True Example
	
	public WebDriver driver;
	
  @Test
  public void testExplicit_Wait_Example() throws InterruptedException{
	  
	  driver.get("https://the-internet.herokuapp.com/");
	  driver.findElement(By.linkText("Dynamic Loading")).click();
	  driver.findElement(By.partialLinkText("Example 2: Element")).click();
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  
	  //explicit wait
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));

	  String actText = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
	  
	  String expText = "Hello World!";
	  System.out.println("The text is : " + actText);
	  
	  Assert.assertEquals(actText, expText);
	  
	  
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
