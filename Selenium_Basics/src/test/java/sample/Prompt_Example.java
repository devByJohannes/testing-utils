package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Prompt_Example {
	
	
	public WebDriver driver;
	
	/*
	 * driver.get("https://www.lambdatest.com/selenium-playground/");

		driver.findElement(By.xpath("//a[normalize-space()='Upload File Demo']")).click();

		driver.findElement(By.id("file")).sendKeys("C:\\Users\\dnr5d\\OneDrive\\Desktop\\AIScreenshot.png");

		String actText=driver.findElement(By.xpath("//div[@id='error']")).getText();

		String expText="File Successfully Uploaded";

		Assert.assertEquals(actText, expText);
	}
	 * 
	 * */
	
	
  @Test
  public void testConfirm_Example() throws InterruptedException {

	  driver.get("https://www.lambdatest.com/selenium-playground/");

		driver.findElement(By.linkText("Javascript Alerts")).click();

		driver.findElement(By.xpath("(//div[@class='mt-30 rounded'])[3]/p/button")).click();

		driver.switchTo().alert().sendKeys("Naga");

		driver.switchTo().alert().accept();

		String name=driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText();

		System.out.println(name);

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
