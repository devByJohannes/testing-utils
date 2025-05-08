package sample;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class seleniumPrograme {
	
	//Johannes Mathelele
	
	  WebDriver driver;
	  
  @Test
  public void fireFoxLaunch() {
        
      driver.get("https://www.selenium.dev/");
      System.out.println("Navigated to Selenium website: " + driver.getTitle());
       
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
