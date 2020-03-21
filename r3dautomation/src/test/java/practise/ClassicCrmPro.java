package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class ClassicCrmPro {
  
	
	 public static WebDriver driver;
	
	
	@BeforeMethod
  public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:/selenium jar files/edgedriver_win64/msedgedriver.exe");
		driver=new EdgeDriver();
driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
	
		
	Thread.sleep(4000);
  }

	
	
	
	@Test
	  public void verifycontactdetails() throws InterruptedException {
			
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,360)");  
				
		
		HashMap<Integer,String> emailmap=new HashMap();
		emailmap.put(1, "test@yopmail.com");
		emailmap.put(2, "test67@yopmail.com");
		emailmap.put(3, "test68@yopmail.com");
		emailmap.put(4, "test69@yopmail.com");
		emailmap.put(5, "test70@yopmail.com");
		
		
		
		Set<Map.Entry<Integer,String>> emap=emailmap.entrySet();
		
		outer:for(Map.Entry<Integer,String> data: emap)
		{
			driver.findElement(By.xpath("//input[@id='email_create']")).clear();
			driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(data.getValue()); 
			Thread.sleep(3000);  
			driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
                  boolean state=false;
			try {
			 state=driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).isDisplayed();
			System.out.println(state);     
			}catch(Exception e) {
				System.out.println("email is now unique");   
				
			}
			
			if(state==true) {
				
				continue outer;
			}else {
				
				
				System.out.println("registration page gets opened");    
				break outer;
			}
			
			
		}
		
		
		Thread.sleep(3000);  
		
		/*if()
		{
			
			
		}else {
			
			
		}*/
		
		
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("test67");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456"); 
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("kunal"); 
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("verma");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("delhi");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("delhi");
	 
		WebElement state=driver.findElement(By.xpath("//select[@id='id_state']"));
		Select statevalue=new Select(state);
		statevalue.selectByValue("Alabama");
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("35005");
		
		
		WebElement country=driver.findElement(By.xpath("//select[@id='id_country']"));
		Select countryvalue=new Select(country);
		countryvalue.selectByValue("United States");
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("1234567878");
			
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("verma");
		driver.findElement(By.xpath("//button[@type='submit' and @name='submitAccount']")).click();
			
		Thread.sleep(3000);  
		
		
		
		
	  }
	 
	
	
  
	@AfterMethod
  public void afterMethod() {
		driver.quit();
		
  }

}
