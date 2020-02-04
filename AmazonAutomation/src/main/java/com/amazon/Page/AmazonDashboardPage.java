package com.amazon.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;

public class AmazonDashboardPage extends AmazonBase {

	@FindBy(xpath="//span[contains(text(),'Account & Lists')][position()=1]") 
	static WebElement accountloginlink;
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") 
	static WebElement searchproductfield;
	
	
	public AmazonDashboardPage() {
		
		PageFactory.initElements(AmazonBase.driver, this);
				
	}
	
	
	public  AmazonLoginPage navigatetologin() {
		accountloginlink.click();
		
		return new AmazonLoginPage();
		
	}
	
	 
	
	public AmazonProductList searchproduct() {
		
		searchproductfield.sendKeys("samsung");  
		searchproductfield.sendKeys(Keys.RETURN);
		//String searchproductname=searchproductfield.getAttribute("value"); 
		
				
		    return new AmazonProductList();
	}
	
	
	
	
	
	
	
}
