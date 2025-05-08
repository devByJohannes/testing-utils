package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class testWindows_Selenium {
	
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
  public void testWindows_Example() throws InterruptedException {

		driver.get("https://www.takealot.com/");

		String pwindow=driver.getWindowHandle();

		System.out.println(pwindow);

		driver.findElement(By.linkText("Help Centre")).click();

		//get window handles

		Set<String> windows= driver.getWindowHandles();

		//remove parent window from windows set

		windows.remove(pwindow);

		//switch to child window

		driver.switchTo().window(windows.iterator().next());

		driver.findElement(By.name("search")).sendKeys("order");

		driver.findElement(By.xpath("//button[@title='search']")).click();

		Thread.sleep(2000);

		//close the child window

		driver.close(); //it will close the currently focused window

		//switch to parent window

		driver.switchTo().window(pwindow);

		driver.findElement(By.linkText("Clearance")).click();



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
