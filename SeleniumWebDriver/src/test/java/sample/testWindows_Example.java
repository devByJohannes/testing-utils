package sample;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

@Test
public class testWindows_Example {
	
	//Johannes Mathelele
	
	  WebDriver driver;
	  
  public testWindows_Example() throws InterruptedException {

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
	  //driver = new ChromeDriver();
	 driver = new FirefoxDriver();  
	  
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
