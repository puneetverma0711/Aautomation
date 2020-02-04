package com.amazon.Page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;

public class AmazonAddToCartPage  extends AmazonBase{


	
	@FindBy(xpath="//a[@id='nav-cart']")     
	static WebElement shoppingcarticonbtn;
	

	@FindBy(xpath="//span[@class='a-size-medium sc-product-title']")   
	static WebElement producttile;
	
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']")     
	static WebElement productprice;
	
	
	@FindBy(xpath="//input[starts-with(@name,'submit.delete')]")    
	static WebElement deleteproductbtn;
	
	
	
	
	
public AmazonAddToCartPage() {
	PageFactory.initElements(AmazonBase.driver, this);
	
}
	
public void clickoncarticon() {
	
	shoppingcarticonbtn.click();
	
		
		
	}
	
	
public void captureproductnamedetails() {
	
	
		HashMap<String,String> hmap=new HashMap<String,String>();
		
		
		hmap.put(producttile.getText(), productprice.getText());  
		 
		Set<Entry<String,String>> s=hmap.entrySet();
		
		for(Entry<String,String> m:s) {
			
			System.out.println("added product name is: "+m.getKey()+ "added product price is: " +m.getValue());  
			
		}
		
		
		
			
	}
	



public void deleteproduct() {
	deleteproductbtn.click();

	List<WebElement> deletedproductname=driver.findElements(By.xpath("//a[@class='a-link-normal sc-product-link']")); 
	
	
	
	for(int i=0;i<deletedproductname.size();i++) {
		
		String productname=deletedproductname.get(i).getText();
		
		System.out.println("deleted product name is:" +productname); 
		break;
	}

}


}
	
	
	

