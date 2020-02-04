package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.Base.AmazonBase;
import com.amazon.Page.AmazonAddToCartPage;
import com.amazon.Page.AmazonDashboardPage;
import com.amazon.Page.AmazonProductDetail;
import com.amazon.Page.AmazonProductList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AmazonAddToCartTest extends AmazonBase{
	AmazonDashboardPage amazondashbaordpage;
	AmazonProductList amazonproductlistpage;
	AmazonProductDetail amazonproductdetailpage;
	AmazonAddToCartPage amazonaddtocartpage;
	
	public AmazonAddToCartTest() {
		
		super();
		
	}
	
	
  
	@BeforeMethod
  public void beforeMethod() throws InterruptedException {
		AmazonBase.initialization();
		amazondashbaordpage=new AmazonDashboardPage();
		amazonproductlistpage=amazondashbaordpage.searchproduct();
		amazonproductlistpage=new AmazonProductList();
		amazonproductdetailpage=amazonproductlistpage.selectproduct();	
		amazonproductdetailpage=new AmazonProductDetail();
		amazonaddtocartpage=amazonproductdetailpage.addproducttocart();
		amazonaddtocartpage=new AmazonAddToCartPage();
	
		
  }

	

	
	
	@Test
  public void verfiyproductdetails() {
		amazonaddtocartpage.clickoncarticon();
		amazonaddtocartpage.captureproductnamedetails();
		amazonaddtocartpage.deleteproduct();
  }
 
	
	
	
	
	
  @AfterMethod
  public void afterMethod() {
	  
	  AmazonBase.quit();
  }
  
  

}
