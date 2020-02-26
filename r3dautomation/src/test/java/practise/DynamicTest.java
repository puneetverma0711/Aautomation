package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DynamicTest {
	 public static WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("file:///D:/htmlfiles/a.html");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
	  
	  
  }

  
  @Test
  public void dynamictest() {
	  
	  driver.findElement(By.cssSelector("button[id='submit'")).click();
	   
	  String text=driver.findElement(By.xpath("//div[@id='hiddenMessage']")).getText(); 
	
	 String a[]=text.split(" ");
	  
	 for(int i=0;i<a.length;i++)
	 
	 {
		if(a[i].contains(".com"))
		{
			System.out.println(a[i]);
			
			
		}
		 
		 
		 
	 } 
	 
	 
	
	  
  }
  
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
