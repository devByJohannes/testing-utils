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

public class Dropdown_Example {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	
	public WebDriver driver;
	
  @Test
  public void tetRadio_Example() {
	  
	  driver.get("http://www.tizag.com/htmlT/htmlselect.php");
	  
	  WebElement dd = driver.findElement(By.xpath("(//select[@name='selectionField'])[1]"));
	  
	  Select s = new Select(dd);
	  //Select by Index
	  //s.selectByIndex(2)
	  
	  //Select By Visible text
	  s.selectByVisibleText("Colorado -- CO");
	  
	  //Select By Value
	 // s.selectByValue("CM")
	  
	  //find default value of selected element
	  
	  WebElement firstSelectedOption = s.getFirstSelectedOption();
	  
	  System.out.println("First selected option is : " +firstSelectedOption.getText());
	  
	  //print all values in dropdown
	  
	  List<WebElement> options =  s.getOptions();
	  
	  System.out.println("All options using For loop : ");
	  
	  for(int i = 0; i< options.size();i++) {
		  
		  System.out.println(options.get(i).getText());
	  }
			
	  
	  System.out.println("All options using For each loop : ");
	  for(WebElement values : options) {
		  
		  System.out.println(values.getText());
	  }
	 
	  
	  
	  //selecting multiple options 
	  

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
