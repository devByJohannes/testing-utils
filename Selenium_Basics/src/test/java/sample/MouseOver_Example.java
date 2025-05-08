package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class MouseOver_Example {
	
	//Johannes Mathelele
	// Selenium Assignment 2
	/*
	 * public void testMouseHOver_Example() throws InterruptedException {

		driver.get("https://www.takealot.com/");

		WebElement	menu=driver.findElement(By.xpath("//span[normalize-space()='Appliances']"));

		//create an object for actions class

		Actions a =  new Actions(driver);

		a.moveToElement(menu).build().perform();

		driver.findElement(By.xpath("//span[normalize-space()='Kettles']")).click();

 

	}
	 * 
	 * 
	 */
	public WebDriver driver;
	
  @Test

  public void testMouseHOver_Example() throws InterruptedException {

		driver.get("https://www.takealot.com/");

		WebElement	menu=driver.findElement(By.xpath("//span[normalize-space()='Appliances']"));

		Actions a =  new Actions(driver);

		a.moveToElement(menu).build().perform();

		driver.findElement(By.xpath("//span[normalize-space()='Kettles']")).click();



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
