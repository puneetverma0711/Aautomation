package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class PageLoadingVerification {

	 public static WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
			
	  }
	
	
	
	@Test
  public void verifypageload() throws InterruptedException {
	
		
		
		
		driver.get("https://crm.zoho.com");
		driver.findElement(By.xpath("//div[@class='zgh-utilities']//a[@class='zgh-login'][contains(text(),'LOGIN')]")).click();
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("puneetverma0711@gmail.com");
		driver.findElement(By.xpath("//button[@class='btn blue']/span")).click();
		Thread.sleep(5000);  
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("confidom@123");
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		boolean status=js.executeScript("return document.readyState").toString().equals("complete");
		int j=0;
		for(int i=0;i<30;i++) {
			if(status==true) {  
				
				System.out.println("homepage is loaded completely");
			j++;
				
			}else {
			
			System.out.println("homepage not loaded");
			}
			
			Thread.sleep(3000); 
			if(j==1)
			{
				break;
				
			}
			
			
		}
		
		
		
		
		
	
		
		
		
  }
 
	
	
	
	
	

 
  @AfterMethod
  public void afterMethod() {
	  
	  
	 driver.quit();
  }
  
  
  

}
