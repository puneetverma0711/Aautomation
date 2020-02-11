package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewContactVerfication {
 
	 public static WebDriver driver;
	 public static HashMap<Integer,String> entereddetails;
	 public static HashMap<Integer,String> displayeddetails;
	
	@BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("puneetverma0711@gmail.com");  
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Chetu@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();   
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		  
  }


	@Test()
	  public void contactverify() throws InterruptedException {
			 entereddetails=new HashMap<Integer,String>();
			
			
		
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();	
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("rahul");
		String firstname=driver.findElement(By.xpath("//input[@name='first_name']")).getAttribute("value");
		System.out.println(firstname);
		
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kumar");
		String lastname=driver.findElement(By.xpath("//input[@name='last_name']")).getAttribute("value");
		System.out.println(lastname);
		entereddetails.put(1, firstname+lastname);  
		
		
		driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("new york");
		String address=driver.findElement(By.xpath("//input[@placeholder='Street Address']")).getAttribute("value");
		System.out.println(address);
		entereddetails.put(2, address);   
		
		driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys("8877665544");
		String phone=driver.findElement(By.xpath("//input[@placeholder='Number']")).getAttribute("value");
		System.out.println(phone);
		entereddetails.put(3, phone);  
		     
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("rahul@gmail.com");	
		String email=driver.findElement(By.xpath("//input[@placeholder='Email address']")).getAttribute("value");
		System.out.println(email);
		entereddetails.put(5, email);  
		
		
		
		

		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();	  
		Thread.sleep(5000);

		
	  }
	  
	
	
	@Test(priority=2)
	  public void verifydetails() throws InterruptedException {
		

		Thread.sleep(5000);
		
		displayeddetails=new HashMap<Integer,String>();
		String beforexpath="//table[@class='ui celled sortable striped table custom-grid table-scroll']/tbody/tr[";
		String afterxpath="]/td["; 
		String displayedtext=null;
		int k=1;
		//"]"
		
		for(int rownum=1;rownum<=1;rownum++) {
			
			
			inner:for(int colnum=2;colnum<=6;colnum++) {
				
				displayedtext=driver.findElement(By.xpath(beforexpath+rownum+afterxpath+colnum+"]")).getText();
				System.out.println(displayedtext);       
				if(displayedtext.isEmpty())
				{
					
					continue inner;
					
				}else {
					displayeddetails.put(k, displayedtext);
					k++;
					
				}
				
				
				
			}
			
		}
		
		   
		if(entereddetails.containsValue(displayeddetails)) {
			
			
			System.out.println("registration details are matched"); 
			
		}else {
			
			Assert.assertTrue(false, "registration details are matched"); 
			
		}
		
		
		
	}
	
	
	
	
	
	
	@AfterMethod
  public void afterMethod() {
		driver.quit();
		
  }

}
