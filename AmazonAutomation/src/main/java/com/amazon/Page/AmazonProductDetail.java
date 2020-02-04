package com.amazon.Page;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;
import com.amazon.Util.AmazonUtilities;

public class AmazonProductDetail extends AmazonBase {

	
	@FindBy(xpath="//input[@id='add-to-cart-button']")  
	static WebElement addtocartbtn;
	
	@FindBy(xpath="//h1[contains(text(),'Added to Cart')]")  
	static WebElement addedtocartactualtext;
	
	
	
	
	
	
	public AmazonProductDetail() {
		PageFactory.initElements(AmazonBase.driver, this); 
		
		
	}

	
	
	public AmazonAddToCartPage addproducttocart() throws InterruptedException {
		
		addtocartbtn.click();
		Thread.sleep(4000);   
		 String actualtext=addedtocartactualtext.getText();
		  
		if(actualtext.equalsIgnoreCase(AmazonUtilities.addtocartexpectedtext)) {
			System.out.println("product has been added to cart succesfully");
			
			
		}else {
			System.out.println("product has not been added to cart succesfully");
			
		}
		
		return new AmazonAddToCartPage();
		
	}
	
	
	
	
	
	
	
}
