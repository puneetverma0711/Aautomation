package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class CalendePickerTest {
  
	 public static WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
	  
		
		
	  }
	
	     
	
	
	
	@Test
  public void verifycalenderdata() throws InterruptedException {
		
		String date="2-March 2020";
		String[] d=date.split("-");
		
		String chosendate=d[0];
		String chosenmonthyear=d[1];
		System.out.println(chosenmonthyear); 
		 
		String beforexpath="//div[@class='DayPicker-Months']//div[";  
		String middlexpath="]//div[3]//div[";
		String afterxpath="]//div[";
		
		
		
		//div[@class='DayPicker-Months']//div[1]//div[3]//div[
		
		
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]//label")).click();
		
		boolean flag=false;
		
		int weekdays=7;
		String calenderdisplayeddate=null;
		
		
		List<WebElement> monthview=driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div"));  
		System.out.println(monthview.size());
		Iterator<WebElement> monthviewit=monthview.iterator();
		
		List<WebElement> monthlist=driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));  
		System.out.println(monthlist.size());  
		Iterator<WebElement> monthlistit=monthlist.iterator();
		 int j=1;     
		while(monthviewit.hasNext()) {
			
			WebElement a=monthviewit.next();
			
			
			while(monthlistit.hasNext()) 
			{
				
				WebElement ele=monthlistit.next();
				String monthele=ele.getText();
				System.out.println(monthele);
				
				
				if(monthele.equals(chosenmonthyear)) 
				
				{
					  j++;
					for(int rownum=1;rownum<=7;rownum++) 
					{
						
						
						for(int colnum=1;colnum<=weekdays;colnum++) 
						{
							
							
							
							
							 calenderdisplayeddate=driver.findElement(By.xpath(beforexpath+rownum+afterxpath+colnum+"]//div[1]//p[1]")).getText();
							 System.out.println(calenderdisplayeddate); 
							
							if(calenderdisplayeddate.equals(chosendate)) {
								
								driver.findElement(By.xpath(beforexpath+j+middlexpath+rownum+afterxpath+colnum+"]//div[1]//p[1]")).click();
								
								
								Thread.sleep(5000);     
								flag=true;
								break;
								
								
							}
							
							
							
						}
						
					
						if(flag)
						{
							
							break;
						}
						
						
					}
					
					
					
					
				}
				
			}
			
			
			break;
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
  }
	
	
	

  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

  
  
  
  
  
}
