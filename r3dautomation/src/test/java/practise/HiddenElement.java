package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class HiddenElement {
 
	 public static WebDriver driver;
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get(" http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html?m=1");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
	  
  }

 
  
	@Test
public void verifyhiddenelment() throws InterruptedException {
		
		List<WebElement> textboxlist=driver.findElements(By.xpath("//input[@id='male'][2]"));
		
		
		Iterator<WebElement> it=textboxlist.iterator();
		
		
		while(it.hasNext()) {
			
			WebElement ele=it.next();
			ele.click();
			Thread.sleep(5000);
			/*if(ele.getLocation().getX()>0)
			{
				ele.click(); 
				System.out.println("element has been clicked successflly");
				Thread.sleep(5000);
			}*/
			
		}
		
		
}
	
	
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();	
	  
  }

}
