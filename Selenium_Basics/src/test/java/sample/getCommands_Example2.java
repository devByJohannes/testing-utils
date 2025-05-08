package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class getCommands_Example2 {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	
	public WebDriver driver;
	
  @Test
  public void GetCommands_Example2() throws InterruptedException {

		driver.get("https://automationexercise.com/");

		driver.findElement(By.linkText("Signup / Login")).click();

		driver.findElement(By.name("name")).sendKeys("Automation");

		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test@gmail.com");

		String name=driver.findElement(By.name("name")).getAttribute("value");

		String email=driver.findElement(By.xpath("//input[@data-qa='signup-email']")).getAttribute("value");

		String placeHolder=driver.findElement(By.xpath("//input[@data-qa='signup-email']")).getAttribute("placeholder");

		System.out.println("Name is :"+name);

		System.out.println("Email is :"+email);

		System.out.println("Place Holder is :"+placeHolder);

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
