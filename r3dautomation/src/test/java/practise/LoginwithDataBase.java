package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginwithDataBase {
  
	 public static WebDriver driver;
	 public static Connection myConn = null;
	 public static Statement myStmt = null;
	 public static ResultSet myRs = null;
	
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://www.red.care/web/");
		driver.manage().window().maximize();
	//driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		
	  }

	
	@Test
  public void loginwithdb() throws SQLException, ClassNotFoundException, InterruptedException {
		String user=null;
		String pass=null;
try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// 1. Get a connection to database
			String url="jdbc:sqlserver://localhost;databaseName=master;";
			String username="sa";
			String password="12345";
			myConn = DriverManager.getConnection(url,"sa","Chetu@123");  
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from users");
			
			// 4. Process the result set
			while (myRs.next()) {
				 user=myRs.getString("name");
				 pass=myRs.getString("password");
				break;
				
			}
		}
		catch (SQLException exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
		
		
		driver.findElement(By.cssSelector("input[id='UserName']")).sendKeys(user);
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		boolean status=js.executeScript("return document.readyState").toString().equals("complete");
		
		
		
			if(status==true) 
			
			{
				
				System.out.println("homepage loaded successfully");
				
				
				
			}else {
				
				System.out.println("homepage not loaded");
			}
			
			
			Thread.sleep(2000);
			
		
		
		
		
  }
 
	
	
  
	
	@AfterMethod
  public void afterMethod() {
	driver.quit();	
		
  }

}
