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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class UniqueDropdowValue {
	 public static WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
		  
		 
		  
	  }


	  
	  @Test
	  public void GroupAcalculatesumofprevclose() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
	driver.get("file:///D:/htmlfiles/searchhtml.html");
			driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		  WebElement ele=driver.findElement(By.id("cars"));
		  
Select dropdown=new Select(ele);

List<WebElement> li=dropdown.getOptions();
List<String> values=new ArrayList<String>();
Iterator<WebElement> it=li.iterator();

outer:while(it.hasNext()) {
	String a=it.next().getText();
	if(!values.contains(a)) 
	{
		
		values.add(a);      
		
	}else {
		
		
		continue outer;
	}
	
	
	
}
   

System.out.println(values.size());

for(int j=0;j<values.size();j++) {
	System.out.println(values.get(j));

	
}
	
	





		  
	  }
	  
	  
	  
	  @Test
	  public void Groupbcalculatesumofprevclose() throws InterruptedException {
		  System.setProperty("webdriver.ie.driver", "D:/selenium jar files/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
	driver.get("file:///D:/htmlfiles/searchhtml.html");
			driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		  WebElement ele=driver.findElement(By.id("cars"));
		  
Select dropdown=new Select(ele);

List<WebElement> li=dropdown.getOptions();
List<String> values=new ArrayList<String>();
Iterator<WebElement> it=li.iterator();

outer:while(it.hasNext()) {
	String a=it.next().getText();
	if(!values.contains(a)) 
	{
		
		values.add(a);      
		
	}else {
		
		
		continue outer;
	}
	
	
	
}
   

System.out.println(values.size());

for(int j=0;j<values.size();j++) {
	System.out.println(values.get(j));

	
}
	
	





		  
	  }

	  
	  
	  
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.quit();
		  
	  }

	  
	  
}
