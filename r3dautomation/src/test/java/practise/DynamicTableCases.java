package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DynamicTableCases {
	 public static WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
	  
  }


  
  @Test(priority=1)
  public void GroupAcalculatesumofprevclose() throws InterruptedException {
	  

		List<WebElement> columnlist=driver.findElements(By.xpath("//table/tbody/tr/td[3]"));  

	System.out.println(columnlist.size()); 
	Thread.sleep(4000);



	Iterator<WebElement> columnlistiterator=columnlist.iterator();

	double sum=0;
	double i;
	while(columnlistiterator.hasNext()) {
		
		WebElement ele=columnlistiterator.next();
		String radio=ele.getText();
		 i = Double.parseDouble(radio);
		sum=sum+i;
		
		
		
	}

	
	System.out.println("total prev close for group a companies is:" +sum);
	  
	
	
	
	if(sum>13000) {
		Assert.assertTrue(true, "sales are  good");
		
	}else {
		
		Assert.assertTrue(false, "sales are not good");
		
	}
	
	
	
	  
  }
  
  
  
  @Test(priority=2)
  public void verifycompanycurrentprice() throws InterruptedException {
	  
	  List<WebElement> companylist=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));  
	  
	  System.out.println(companylist.size()); 
		Thread.sleep(4000);

		
		

		Iterator<WebElement> companylistiterator=companylist.iterator();

		while(companylistiterator.hasNext()) {
			
			WebElement ele=companylistiterator.next();
			String company=ele.getText();
			//System.out.println(company); 
			
			if(company.equals("NIIT Technologies"))
			
			{
				System.out.println(company);   
				String currentprice=driver.findElement(By.xpath("//table/tbody/tr/td[4]")).getText();
				System.out.println(currentprice);
				double price=Double.parseDouble(currentprice);
				if(price>500) 
				{
					System.out.println("NIIT Technologies current month price is more than 500"); 
					
				}else {
					
					Assert.assertTrue(false, "NIIT Technologies current month price is less than 500"); 
					
				}
				
			}  
			
		}
		
	 
	  
  }
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  
  }

  
  
  
  
  
  
  
  
  
  
  
  
}
