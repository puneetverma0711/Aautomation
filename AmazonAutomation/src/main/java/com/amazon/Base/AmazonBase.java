package com.amazon.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

import com.amazon.Util.AmazonUtilities;



public class AmazonBase {

	public static Properties prop;
	 public static WebDriver driver;
public static Wait<WebDriver> wait;
	
	public AmazonBase() {
		
		try {
			InputStream input = new FileInputStream("D:/projects/CrmApplication-master/AmazonAutomation/src/main/java/com/amazon/config/Amazon.properties");
			
			
           prop = new Properties();

          // load a properties file
          prop.load(input);

         

      } catch (IOException ex) {
          ex.printStackTrace();
      }
		
		
	}
	
	
	
	
	
	public  static void  initialization() {
		String browsername= prop.getProperty("browser");
		
		if(driver==null) { 
		if(browsername.equals("chrome")) {
			/*ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--headless");*/
			System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			
			
			
		}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/selenium jar files/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	
		}
		
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(AmazonUtilities.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(AmazonUtilities.IMPLICITWAIT_TIMEOUT, TimeUnit.SECONDS);

driver.get(prop.getProperty("url"));

	
	}
	
	
	public static void quit() {
		
		driver.quit();
		driver=null;
		
	}
	
public static void close() {
		
		driver.close(); 
		driver=null;
		
	}

	
	
	
	
	
	
}
