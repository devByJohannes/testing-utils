package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Confirm_Example {
	
	
	public WebDriver driver;
	
  @Test
  public void testConfirm_Example() throws InterruptedException {

	  driver.get("https://www.lambdatest.com/selenium-playground/");

	  driver.findElement(By.linkText("Javascript Alerts")).click();

	 driver.findElement(By.xpath("//p[@class='text-gray-900 text-size-16 mt-10 text-black font-bold']//button[@type='button'][normalize-space()='Click Me']")).click();

	 String cMsg=driver.switchTo().alert().getText();

	 System.out.println(cMsg);

	 //click ok button

//	 driver.switchTo().alert().accept();

//	 String msg=driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText();

//	 System.out.println(msg);

	 //click on cancel button

	 driver.switchTo().alert().dismiss();

	 String msg=driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText();

	 System.out.println(msg);

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
