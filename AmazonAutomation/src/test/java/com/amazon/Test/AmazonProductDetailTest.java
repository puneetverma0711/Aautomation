package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.Base.AmazonBase;
import com.amazon.Page.AmazonAddToCartPage;
import com.amazon.Page.AmazonDashboardPage;
import com.amazon.Page.AmazonProductDetail;
import com.amazon.Page.AmazonProductList;

import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

import org.testng.annotations.AfterMethod;

public class AmazonProductDetailTest extends AmazonBase {
	AmazonDashboardPage amazondashboardpage;
	AmazonProductList amazonproductlistpage;
	AmazonProductDetail amazonproductdetailpage;
	AmazonAddToCartPage amazonaddtocartpage;
	
	public  AmazonProductDetailTest() {
		
		super();
		
	}
	
	
	@BeforeMethod
	  public void beforeMethod() {
		AmazonBase.initialization();
		amazondashboardpage=new AmazonDashboardPage();
		amazonproductlistpage=amazondashboardpage.searchproduct();
		amazonproductlistpage=new AmazonProductList();
		amazonproductdetailpage=amazonproductlistpage.selectproduct();
		amazonproductdetailpage=new AmazonProductDetail();
		
		
		
	  }

	
	
	@Test(priority=1)
  public void verifyproductaddtocart() throws InterruptedException {
	  
		amazonaddtocartpage=amazonproductdetailpage.addproducttocart();
		
		      
  }
 
	
	
  
	
	
	
	@AfterMethod
  public void afterMethod() {
		
		AmazonBase.quit();
  }

	
	
}
