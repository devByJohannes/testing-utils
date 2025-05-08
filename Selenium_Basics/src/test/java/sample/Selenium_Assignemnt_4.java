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

public class Selenium_Assignemnt_4 {
	
	//Johannes Mathelele
	//Selenium Assignment 4
	
	public WebDriver driver;
	
  @Test
  public void tetRadio_Example() {
	  
	  //Navigate to https://the-internet.herokuapp.com/
	  driver.get("https://the-internet.herokuapp.com/");
	  
	   //Click on Dropdown link
	   driver.findElement(By.xpath("(//a[normalize-space()='Dropdown'])")).click();
	  
	  
	   //Selecting Option 2
	   WebElement dd = driver.findElement(By.xpath("//select[@id='dropdown']"));
	   
	   Select s = new Select(dd);
	   s.selectByIndex(2);
	  
	   
	   	
		  //print all values in dropdown
		  
		  List<WebElement> options =  s.getOptions();
		  
			
		  
		  System.out.println("Printing of all options for drowpdown");
		  for(WebElement values : options) {
			  
			  System.out.println(values.getText());
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
