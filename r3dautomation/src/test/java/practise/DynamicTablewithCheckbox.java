package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DynamicTablewithCheckbox {
	 public static WebDriver driver;
	
	
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	       

	  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://chercher.tech/webdriverio/dynamic-webtable");
		driver.manage().window().maximize();
		 
		
		//driver.findElement(By.xpath("//a[@class='closesubscribe']")).click();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
  }

  
  
  @Test
  public void checkonparticularcompany() throws InterruptedException {
	 
	//  driver.findElement(By.xpath("/html/body/div/div/form/div/div/div/a")).click();
		List<WebElement> companylist=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));   
		List<WebElement> chkbxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));    
	System.out.println(chkbxlist.size());  
	System.out.println(companylist.size()); 
	Thread.sleep(4000);
	Iterator<WebElement> companylistiterator=companylist.iterator();
	
	
	outer:for(WebElement chkdata:chkbxlist) {
		while(companylistiterator.hasNext()) {
			
			WebElement companyname=companylistiterator.next();
			String name=companyname.getText();
			
			if(name.equals("Chercher.tech")) { 
				chkdata.click();
				Thread.sleep(6000);
				
			}else {
				
				continue outer;
				
			}
		
		
	}
	
	}

	


	
	
	
	  
  }
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit(); 
  }

}
