package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.Base.AmazonBase;
import com.amazon.Page.AmazonDashboardPage;
import com.amazon.Page.AmazonLoginPage;
import com.amazon.Util.AmazonUtilities;



import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmazonLoginTest extends AmazonBase  {
	
	AmazonLoginPage amazonloginpage;
	AmazonDashboardPage amazondashboardpage;
	
	public AmazonLoginTest() {
		super();
		
		
	}
	
	
	@BeforeMethod
	  public void beforeMethod() {
		AmazonBase.initialization();		
		amazondashboardpage=new AmazonDashboardPage();
		amazonloginpage=amazondashboardpage.navigatetologin();
		amazonloginpage=new AmazonLoginPage();
		
		}

	
	 
	
	@Test
  public void verifylogin() throws InterruptedException, IOException {
		amazondashboardpage=amazonloginpage.login(AmazonBase.prop.getProperty("username"), AmazonBase.prop.getProperty("password"));
		Assert.assertEquals(driver.getTitle(), AmazonUtilities.dashboardpagetitletext);
		
		  
		
	}
  
	
	
	
	
  @AfterMethod
  public void afterMethod() {
	  AmazonBase.quit();
  
  }

}
