package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParentChild {
  
	public static WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
		driver.get("file:///D:/htmlfiles/parentchild.html");
}

	
	
	@Test
  public void f() throws InterruptedException {  
		driver.findElement(By.xpath("//div[@class='parent']/input[@name='namefield']")).sendKeys("test");
		Thread.sleep(4000);
		
  }
  
	
  
	
	@AfterMethod
  public void afterMethod() {
		driver.quit();
		
  }

}
