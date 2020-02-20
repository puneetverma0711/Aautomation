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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class ProductVerification {

	 public static WebDriver driver;
	
	
	@BeforeMethod
 public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://www.awwwards.com/websites/e-commerce/");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  	
	Thread.sleep(4000);
 }

	
	
	
	@Test
	  public void verifycontactdetails() throws InterruptedException {
			
		driver.findElement(By.xpath("//span[contains(text(),'E-Commerce')]")).click();
		driver.findElement(By.xpath("//div[@class='js-tags']//a[@class='item'][contains(text(),'Games & Entertainment')]")).click();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,212)"); 
		Thread.sleep(3000);  
		HashMap<Integer,String> productmap=new HashMap();
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='box-info']/div[@class='content']/div[@class='row']/h3/a"));
		
		Iterator<WebElement> it=li.iterator();
		String a=null;
		while(it.hasNext()) {
			
			WebElement e= it.next();
			 a=e.getText();
			 System.out.println(a);
			 break;
		}
		

		productmap.put(1, a);
		
		
		driver.findElement(By.xpath("//div[@id='js-search-container']//*[@class='ico-svg']")).click();
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//input[@id='search-text']")).sendKeys(a);  
		
		
		js.executeScript("window.scrollBy(0,212)"); 
		Thread.sleep(3000);  
		
String searchedproductname=driver.findElement(By.xpath("//div[@id='submission']//a[contains(text(),'"+a+"')]")).getText();
System.out.println(searchedproductname);		  

		  
		
		if(productmap.get(1).equals(searchedproductname)) {
			
			System.out.println("product is same");
			
			
		}else {
			
			
			System.out.println("product is not same");
			
		}
		
		
		/*
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
			
			
		}*/
		
		
		Thread.sleep(3000);  
		
		
			
		
		
		
		
	  }
	 
	
	
 
	@AfterMethod
 public void afterMethod() {
		driver.quit();
		
 }

}
