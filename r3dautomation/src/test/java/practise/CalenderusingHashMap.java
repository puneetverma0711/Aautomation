package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CalenderusingHashMap {
  
	 public static WebDriver driver;

	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
	driver.get("https://phptravels.net/");
			driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		  driver.manage().deleteAllCookies();
	  }
	
	
	@Test(enabled=false)
  public void verifydate() throws InterruptedException {
		
		
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "January");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(6, "June");
		map.put(7, "July");
		map.put(8, "August");
		map.put(9, "September");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
		

		
		
		HashMap<Integer,Integer> daysmap=new HashMap<Integer,Integer>();
		daysmap.put(1, 1);
		daysmap.put(2, 2);
		daysmap.put(3, 3);
		daysmap.put(4, 4);
		daysmap.put(5, 5);
		daysmap.put(6, 6);
		daysmap.put(7, 7);
		daysmap.put(8, 8);
		daysmap.put(9, 9);
		daysmap.put(10, 10);
		daysmap.put(11, 11);
		daysmap.put(12, 12);
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//input[@id='checkin']")); 
		
		js.executeScript("window.scrollBy(0,224)");  
		Thread.sleep(5000);
		ele.click();
		Thread.sleep(5000);
		
	
		
		outer:for(int i=0;i<=12;i++) 
		
		{  
			String getmonth=driver.findElement(By.xpath("//div[@class='datepickers-container']/div[1]/nav/div[2]")).getText();
			String m[]=getmonth.split(",");
			String getdatemonth=m[0];
			String d=driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[2]//div["+daysmap.get(12)+"]")).getText();
			if(map.get(11).equals(getdatemonth) && !d.isEmpty()) {

				driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[2]//div["+daysmap.get(12)+"]")).click(); 
				break outer ;
				
			}else {
				
				driver.findElement(By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]")).click();
				
			}
			
			
			
		}

		
	
		
		Thread.sleep(5000);	
		
		
	
		
		
  }
  
  
  @Test()
  public void verifyflightname() throws InterruptedException {
	  
	  
	  
	  driver.findElement(By.xpath("//a[contains(@class,'text-center flights')]")).click();
	  Thread.sleep(5000);  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,224)");  
		Thread.sleep(3000);  
		WebElement elem=driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//div[@class='select2-search']/input[@type='text']")); 
		elem.click();
		Thread.sleep(3000);  
		elem.sendKeys("cal"); 
		Thread.sleep(3000);   
	  
	  
	 
	 
	
	 
	  
	  List<WebElement> autocomletelist=driver.findElements(By.xpath("//ul[@class='select2-results']/li/div/span"));
	  int size=autocomletelist.size();
	  
	  for(int i=0;i<=size;i++) {
		  
		  String aele=autocomletelist.get(i).getText();
		  
		  if(aele.equalsIgnoreCase("gary(YQF)")) { 
			  autocomletelist.get(i).click();
			  
			  
		  }
		  
		  
		  
	  }
	  
	  
	  
	  
	  
  }

  
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
