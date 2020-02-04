package com.amazon.Page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;

/*import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;*/

public class AmazonLoginPage extends AmazonBase {

	@FindBy(xpath="//input[@id='ap_email']") 
	static WebElement email;
	
	@FindBy(xpath="//input[@id='continue']") 
	static WebElement continuebtn;
	
	
	@FindBy(xpath="//input[@id='ap_password']") 
	static WebElement password;
	
	@FindBy(id="auth-captcha-guess") 
	static WebElement autocaptchatextfield;
	
	
	
	@FindBy(xpath="//input[@id='signInSubmit']") 
	static WebElement loginbtn;
	
	
	
	public AmazonLoginPage() {
		PageFactory.initElements(AmazonBase.driver, this);
		}
	
	
	public AmazonDashboardPage login(String username,String Password) throws InterruptedException, IOException {
		
		email.sendKeys(username);
		continuebtn.click();
		Thread.sleep(3000);
		password.sendKeys(Password);
		/*
		 * File src=driver.findElement(By.id("auth-captcha-image")).getScreenshotAs(
		 * OutputType.FILE);
		 */
		
		
		/*
		 * ITesseract image = new Tesseract(); String imagetext=image.doOCR(new
		 * File("user.dir"+"/screenshots/captcha.png")); System.out.println(imagetext);
		 */ 
		 //String FinalText=imagetext.split("")
		 
		loginbtn.click();
		Thread.sleep(3000);
		TakesScreenshot scrShot =((TakesScreenshot)AmazonBase.driver);
		File src=scrShot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("F:/CrmApplication/AmazonAutomation/screenshots/captcha.png"));
		
		return new AmazonDashboardPage();
		
	}
	
	
	
	
	
}
