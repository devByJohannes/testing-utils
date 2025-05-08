package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Links_example {
	
	public WebDriver driver;
	
  @Test
  public void testLinks_example() throws InterruptedException {
	  driver.get("https://www.takelot.com/");
	  //click is for --links,buttons, radio buttons and check boxes
	  
	  driver.findElement(By.linkText("Sell on Takealot")).click();
	  //Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//img[@alt='Takealot']")).click();
	  //Thread.sleep(3000);
	  
	  driver.findElement(By.partialLinkText("Cleara")).click();
	  
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
