package practise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioandcheckbox {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/radio.html");
		
	driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	
	
	
	
	
	
	List<WebElement> radiooptions=driver.findElements(By.xpath("//input[@type='checkbox']")); 

System.out.println(radiooptions.size()); 
Thread.sleep(4000);



Iterator<WebElement> radiooptionsiterator=radiooptions.iterator();


while(radiooptionsiterator.hasNext()) {
	
	WebElement ele=radiooptionsiterator.next();
	String radio=ele.getAttribute("value"); 
	System.out.println(radio); 
	if(radio.equals("checkbox2")){    
		ele.click();
		System.out.println("checkbox2 found" ); 
	}else {
		
		System.out.println("checkbox2 not found"); 
		
	}
	
	
	
}

Thread.sleep(4000);


driver.quit();
		

	}

}
