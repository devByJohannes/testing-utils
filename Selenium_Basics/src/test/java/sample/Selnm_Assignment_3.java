package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Selnm_Assignment_3 {
	
	//Johannes Mathelele
	//Selenium Assignment 3 
	
	public WebDriver driver;
	
  @Test
  public void test_Asignment_3() {
	  
	
			driver.get("https://the-internet.herokuapp.com/");
			
			
			driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
			
			
			driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
		  
			
			boolean status = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected();
		  
			
			if (status) {
				System.out.println("Check box 2 is already selected, I will uncheck it now.");
				driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
			} else {
				System.out.println("Check box 2 is not selected.");
			}
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver =  new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
  }

}
