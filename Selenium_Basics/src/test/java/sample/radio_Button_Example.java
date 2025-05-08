package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class radio_Button_Example {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	
	public WebDriver driver;
	
  @Test
  public void tetRadio_Example() {
	  
	  driver.get("http://www.tizag.com/htmlT/htmlradio.php");

//	  driver.findElement(By.xpath("//div[4]//input[2]")).click();

	  driver.findElement(By.xpath("(//div[@class='display'])[1]/input[2]")).click();
	 
	  boolean status = driver.findElement(By.xpath("(//div[@class='display'])[1]/input[2]")).isSelected();
	  
	  if(status) {
		  System.out.println("Greek is already selected");
	  }
	  
	  else {
		  System.out.println("This is not selected");
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
