package practise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	
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

Thread.sleep(4000);
System.out.println("total prev close for group a companies is:" +sum);

driver.quit();
		
	}

}
