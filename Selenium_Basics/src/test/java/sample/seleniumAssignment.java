package sample;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class seleniumAssignment {
	
	public WebDriver driver;
  @Test
  public void testBasicElements_Example() {
	  driver.get("https://www.takelot.com/");
	  driver.findElement(By.name("search")).sendKeys("laptop"); 
//	  driver.findElement(By.className("button search-btn search-icon")).click();  //as classame
	  
	  //you can use any xpath mentioned below to identify search button
	  
	  /*
	   * 
	   * button[@title='search']
	   * button[@class='button search-btn search-icon']
	   * button[@type='submit']
	   * */
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

}
