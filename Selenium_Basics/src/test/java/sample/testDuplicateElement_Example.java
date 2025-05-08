package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class testDuplicateElement_Example {
	
	
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.selenium.dev/");

	  //this will identify the first element, with same xpath there are 5 elements

	 // driver.findElement(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']")).click();

	  //this xpath will identify based on index

	  driver.findElement(By.xpath("(//li[@class='nav-item mr-4 mb-2 mb-lg-0'])[2]")).click();

	  //this xpath will identify based on parent and index

//	  driver.findElement(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 ps-4 ps-lg-2']/li[3]")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

}
