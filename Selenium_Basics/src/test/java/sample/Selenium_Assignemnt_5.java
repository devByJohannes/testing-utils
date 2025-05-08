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

public class Selenium_Assignemnt_5 {
	
	//Johannes Mathelele
	//Selenium Assignment 5
	
	public WebDriver driver;
	
  @Test
  public void seleniumAssignment_Example() throws InterruptedException{
	  
	  //Navigate to https://www.takealot.com/
	  driver.get("https://www.selenium.dev/");

	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  
	  System.out.println("Number of links : "+links.size());
	  
	  for(int i = 0; i<links.size();i++) {
		  System.out.println("Links with Tage name : "+links.get(i).getText());
	  }
	  
	  List<WebElement> header = driver.findElements(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 ps-4 ps-lg-2']/li"));
	   
	  System.out.println("Number of header links : "+header.size());
	  
	  for(WebElement hText : header) {
		  System.out.println("Header links Text: " + hText.getText());
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
