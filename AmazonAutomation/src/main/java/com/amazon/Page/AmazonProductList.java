package com.amazon.Page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;

public class AmazonProductList  extends AmazonBase{

	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")  
	static WebElement selectproduct;
	
	

	
	
	public AmazonProductList() {
		
		PageFactory.initElements(AmazonBase.driver, this);
		
	}
	
	
	
	public AmazonProductDetail selectproduct() {
		
		selectproduct.click();
		
		 String MainWindow=driver.getWindowHandle();
			Set s=driver.getWindowHandles();
			Iterator<String> it=s.iterator();
			
			while(it.hasNext()) {
				String childid=it.next();
				
				if(!MainWindow.equals(childid)) {
				
				driver.switchTo().window(childid);
				 
				
				}
			}
			
		
		return new AmazonProductDetail();
		
	}
	
	
	
	
	
	
}
