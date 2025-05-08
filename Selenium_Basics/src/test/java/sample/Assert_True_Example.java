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
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Assert_True_Example {
	
	//Johannes Mathelele
	//Assert True Example
	
	public WebDriver driver;
	
  @Test
  public void tetAssertTrue_Example() throws InterruptedException{
	  
	  driver.get("https://www.takealot.com/");

		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("customer_login_email")).sendKeys("dnr@gmail.com"); //create a dummy email

		driver.findElement(By.name("password")).sendKeys("Selenium@1234");

		driver.findElement(By.xpath("//button[@class='button submit-action']")).click();

		boolean status=isElementPresent(By.xpath("(//button[@class='top-nav-module_button-link_3JRg7'])[2]"));

		Assert.assertTrue(status, "Element is not present");

	}
	   
  
  
  public boolean isElementPresent(By locator) {
	  
	  try {

			driver.findElement(locator);

			return true;

		} catch (Exception e) {

			return false;

		}
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
