package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class selenium_Assignemt_2 {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	
	public WebDriver driver;
	
  @Test
  public void login_SignUp() {
	  
	  driver.get(" https://automationexercise.com/");
	  
	  driver.findElement(By.linkText("Signup / Login")).click();
	  
	  driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("test@test.com");
	  driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Password123");
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	  
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
