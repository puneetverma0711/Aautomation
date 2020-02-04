package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.Base.AmazonBase;
import com.amazon.Page.AmazonDashboardPage;
import com.amazon.Page.AmazonProductDetail;
import com.amazon.Page.AmazonProductList;
import com.amazon.Util.AmazonUtilities;

import org.testng.annotations.BeforeMethod;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmazonProductListTest extends AmazonBase {
	AmazonDashboardPage amazondashbaordpage;
	AmazonProductList amazonproductlistpage;
	AmazonProductDetail amazonproductdetailpage;
	
	public AmazonProductListTest() {
		
		super();
		
	}
	
	@BeforeMethod
	  public void beforeMethod() {
		AmazonBase.initialization();
		amazondashbaordpage=new AmazonDashboardPage();
		amazonproductlistpage=amazondashbaordpage.searchproduct();
		amazonproductlistpage= new AmazonProductList();
			
	  }
	
	
	@Test
  public void verifyproductselection() throws InterruptedException {
		amazonproductdetailpage=amazonproductlistpage.selectproduct();
		String actualproductdetailtitle=driver.getTitle();
		
			
			Assert.assertEquals(actualproductdetailtitle, AmazonUtilities.productdetailpagetitletext);
			
					
		
  }
       
	
	

	
	
  @AfterMethod
  public void afterMethod() {
	  AmazonBase.quit();
	  
  }

}
