package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.Base.AmazonBase;
import com.amazon.Page.AmazonDashboardPage;
import com.amazon.Page.AmazonLoginPage;
import com.amazon.Page.AmazonProductList;
import com.amazon.Util.AmazonUtilities;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmazonDashboardTest extends AmazonBase{
 
	AmazonDashboardPage amazondashboardpage;
	AmazonLoginPage amazonloginpage;
	AmazonProductList amazonproductlistpage;
	
	
	public AmazonDashboardTest()
	{
		 super();
		
	}
	
	@BeforeMethod
  public void beforeMethod() {
           
		AmazonBase.initialization();
		amazondashboardpage=new AmazonDashboardPage();
	}

	

	@Test(enabled=false)
  public void verifyloginpage() {
  
		
		amazonloginpage=amazondashboardpage.navigatetologin();
		
	
	}
	
	
	
	@Test
	  public void verifysearchproduct() throws InterruptedException {
	  
			
		amazonproductlistpage=amazondashboardpage.searchproduct();
			String actualtitle=driver.getTitle();
			Thread.sleep(2000); 
			Assert.assertEquals(actualtitle, AmazonUtilities.productlistpagetitletext); 
		 
		}
	
	
	
	
	
  @AfterMethod
  public void afterMethod() {
  
	  AmazonBase.quit();
  }

}
