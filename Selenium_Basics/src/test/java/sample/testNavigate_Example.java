package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class testNavigate_Example {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	
	public WebDriver driver;
	
  @Test
  public void testNavigate_Example2() throws InterruptedException {

		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()]='Downloads'")).click();
		String dTitle = driver.getTitle();
		driver.findElement(By.xpath("//span[normalize-space()]='Documentation'")).click();

		String docTitle = driver.getTitle();
		
		System.out.println(dTitle);
		System.out.println(docTitle);
		
		Thread.sleep(2000);  //in real time thread.sleep is not required
		
		driver.navigate().back();  // it will simulate action of pressing back button
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward(); //it will simulate action of pressing forward button
		Thread.sleep(2000);
		
		driver.navigate().refresh();  //it will simulate action of pressing refresh button
		Thread.sleep(2000);
		
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
