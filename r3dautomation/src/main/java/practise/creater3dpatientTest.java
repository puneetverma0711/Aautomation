package practise;

import org.testng.annotations.Test;
import org.testng.collections.Lists;


import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class creater3dpatientTest {
	  WebDriver driver;
	  String patientdatasheet = "patientdata"; 
	  String medicationdatasheet = "medicationdata"; 
	  
  @BeforeMethod
  public void setup() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
	
	    this.driver = new ChromeDriver(); 
	  this.driver.manage().window().maximize();
	    this.driver.manage().deleteAllCookies();
	    this.driver.manage().timeouts().pageLoadTimeout(250, TimeUnit.SECONDS);
	    this.driver.get("http://www.red.care/Web");
	    this.driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("devendrav@chetu.com");
	    this.driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jan@1234");   
	    this.driver.findElement(By.xpath("//div[@class='button-group']//input[@id='logintimezone']")).click(); 
	    Thread.sleep(3000L);
	    this.driver.findElement(By.xpath("//a[contains(text(),'NAVIGATOR')]")).click();   
	    Thread.sleep(3000L);
	    this.driver.findElement(By.xpath("//input[@id='searchfacility']")).sendKeys("marshall co. dev. &"); 
	    Thread.sleep(3000L);
	    this.driver.findElement(By.xpath("//div[@class='col-md-4 marB-15 clearfix myclass']//p[@id='pFacilityName']")).click();
	    Thread.sleep(3000L);
	    this.driver.findElement(By.xpath("//div[@class='col-md-4 marB-15 clearfix myclass']//button[@id='121']")).click();
	    Thread.sleep(3000L);
	    this.driver.findElement(By.xpath("//a[@class='inner-menu-text']")).click();   
	    Thread.sleep(3000L);
	    this.driver.findElement(By.xpath("//a[contains(text(),'Patient table')]")).click();
	    
  }


  
  @DataProvider
	public Object[][] getPatientData() {
	  Object data[][] =ExcelData.getTestData(patientdatasheet);
	  
	  
	  return data;
		     	
	}
  
  
  @DataProvider
	public Object[][] getMedicationData() {
	  Object meddata[][] =ExcelData.getTestData(medicationdatasheet);
	  
	  return meddata; 
		     	
	}

  

  @Test(priority=1,dataProvider="getPatientData")
  public void addpatient(String status,String  patientid,String patientbarcode,String fname,String lname,String eyecolor,String haircolor,String phone,String dob,String gender,String ssn,String add,String zip,String unit,String room) throws InterruptedException {
    
    
	  Thread.sleep(3000L);
	  JavascriptExecutor jse=jse= (JavascriptExecutor)this.driver; 
    jse.executeScript("window.scrollBy(0,40)");
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//div[@class='blue-bar bluebaroptionsheader']//a[1]")).click(); 
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//a[@id='btnAddNewPatient']")).click(); 
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//div[@id='staff-option']//div[1]//ul[1]//li[1]//h2[1]//span[3]//a[1]")).click();  //dd
    Thread.sleep(3000L);
    
   WebElement statusi= this.driver.findElement(By.xpath("//select[@id='ddlStatus']"));  
    Select stat = new Select(statusi);
    Thread.sleep(3000L);
    stat.selectByVisibleText(status);   
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtPatientID']")).sendKeys(patientid);
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtPatientBarcode']")).sendKeys(patientbarcode);
    
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys(fname);
    
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys(lname); 
    
    
    Thread.sleep(3000L);
    WebElement ecolor= this.driver.findElement(By.xpath("//select[@id='ddlEyeColor']"));  
    Select eyecol = new Select(ecolor);
    Thread.sleep(3000L);
    eyecol.selectByVisibleText(eyecolor);
    
    Thread.sleep(3000L);
    WebElement hcolor= this.driver.findElement(By.xpath("//select[@id='ddlHairColor']"));    
    Select haircol = new Select(hcolor); 
    Thread.sleep(3000L);
    haircol.selectByVisibleText(haircolor);
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(phone);  
    Thread.sleep(3000L);
    
    this.driver.findElement(By.xpath("//input[@id='txtDateOfBirth']")).click();
    Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtDateOfBirth']")).sendKeys(dob);   
 
    
    Thread.sleep(3000L);
    WebElement genderi= this.driver.findElement(By.xpath("//select[@id='ddlGender']"));    
    Select gende = new Select(genderi);   
    Thread.sleep(3000L);
    gende.selectByVisibleText(gender); 
    Thread.sleep(3000L);
    
    this.driver.findElement(By.xpath("//input[@id='txtSSN']")).sendKeys(ssn);  
    
     Thread.sleep(3000L);
    
    this.driver.findElement(By.xpath("//input[@id='txtAdress1']")).sendKeys(add);   
    jse.executeScript("window.scrollBy(0,90)");    
 Thread.sleep(3000L);
 this.driver.findElement(By.xpath("//input[@id='txtZipCode']")).click();
 Thread.sleep(3000L);
    this.driver.findElement(By.xpath("//input[@id='txtZipCode']")).sendKeys(zip); 
    Thread.sleep(3000L);
  
   List<WebElement> list= this.driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']")); 
   System.out.println(list.size()); 
 
   
    for(int i=0;i<list.size();i++) {
	   
	   if(list.get(i).getText().contains("11001")) {
		   
		   list.get(i).click(); 
		   break;
		   
	   }
	   
   } 
   
   
    

    
 
Thread.sleep(3000L);
 
 this.driver.findElement(By.xpath("//label[contains(text(),'White/Caucasian')]")).click(); 

jse.executeScript("window.scrollBy(40,0)"); 

Thread.sleep(3000L);

this.driver.findElement(By.xpath("//a[contains(text(),'LOCATION OBSERVATION')]")).click(); 



Thread.sleep(3000L);
this.driver.findElement(By.xpath("//select[@id='ddlLocationUnitDynamic']")).sendKeys(unit); //room



Thread.sleep(3000L);
this.driver.findElement(By.xpath("//select[@id='ddlUnitLabel2']")).sendKeys(room); 


Thread.sleep(3000L);  

this.driver.findElement(By.xpath("//div[@id='staff-option']//a[@id='btnSaveNewInmate']")).click(); 
Thread.sleep(3000L); 

















    System.out.println("passed");
   
    
    
  }

  

  @Test(priority=3,dataProvider="getMedicationData")
  public void addmedicationnextpatient(String supply,String  searchmed, String freq,String markf,String dispfamt,String marks,String dispsamt,String markt,String markttime,String disptamt,String medstartdate,String pcount)  throws InterruptedException
  {
	  
	  JavascriptExecutor jsee= (JavascriptExecutor)this.driver; 
	  
	  Thread.sleep(3000L);  
	  
	  List<WebElement> patientlist=this.driver.findElements(By.xpath("//tr[@class='accordion-toggle  ']/td[1]"));  
	 
	  System.out.println(patientlist.size());
	  
	  for(int i=1;i>=0;i--) {
		 
		  boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) {
		        try {
		        	 patientlist.get(i).click(); 
		        	
		            result = true;
		           
		            break;
		          
		         
		            
		        } catch(Exception e) {
		        }
		        attempts++;
		        
		    
		    } 	
		    
		   
		  
		  
			      
		    
			  Thread.sleep(6000L);
			  List<WebElement> medbuttonlist=this.driver.findElements(By.xpath("//a[contains(text(),'Medication')]"));  
			  for(int k=1;k>=0;k--) {
					 
				  boolean result1 = false;
				    int attempts1 = 0;
				    while(attempts1 < 2) {
				        try {
				        	medbuttonlist.get(k).click();   
				        	
				            result1 = true;
				           
				            break;
				          
				         
				            
				        } catch(Exception e) {
				        }
				        attempts1++;
				        
				    }
			  }
			  
				  Thread.sleep(3000L);
				  this.driver.findElement(By.xpath("//a[contains(text(),'PATIENT Options')]")).click();
				
				  Thread.sleep(3000L);
				  
				  this.driver.findElement(By.xpath("//a[contains(text(),'Edit INFORMATION')]")).click();
				  
				 
				  Thread.sleep(3000L);
				  this.driver.findElement(By.xpath("//div[@id='div3']//span[3]//a[1]")).click(); 
				  
				  
				  Thread.sleep(3000L);
				    
				 WebElement  tcCheckbox=this.driver.findElement(By.xpath("//body/div[@id='divInmateScreensContainer']/div[@class='tab-content']/div[@id='settings']/div[@class='tab-content']/div[@id='staff-option']/div[@class='container']/form[@id='frmEditInmate']/div/div[@id='div3']/ul/li/div[@id='divMedicalInformationScreens']/div[@id='hide-social-accordion']/div[@class='panel panel-default']/div[@id='DivAllergyEdit']/div[@class='panel-body bor-none']/div[@class='table-responsive']/table[@class='edit-table table-bordered']/tbody/tr/td/label[1]"));
				 jsee.executeScript("arguments[0].scrollIntoView(true);",tcCheckbox); 
				 //boolean tcCheckIsDisplayed = tcCheckbox.isDisplayed();

	             // System.out.println("Is Terms and condition checkbox displayed: "+tcCheckIsDisplayed);
				 this.driver.findElement(By.xpath("//body/div[@id='divInmateScreensContainer']/div[@class='tab-content']/div[@id='settings']/div[@class='tab-content']/div[@id='staff-option']/div[@class='container']/form[@id='frmEditInmate']/div/div[@id='div3']/ul/li/div[@id='divMedicalInformationScreens']/div[@id='hide-social-accordion']/div[@class='panel panel-default']/div[@id='DivAllergyEdit']/div[@class='panel-body bor-none']/div[@class='table-responsive']/table[@class='edit-table table-bordered']/tbody/tr/td/label[1]")).click();
			 
				  Thread.sleep(3000L);
				  WebElement mySelectElement = driver.findElement(By.id("ddlSuppliedBy")); //select option from supplied by drop down field
					Select dropdown= new Select(mySelectElement);	
					Thread.sleep(4000);
					dropdown.selectByVisibleText(supply);
					Thread.sleep(3000L);
					
					this.driver.findElement(By.id("txtSearchMedication")).sendKeys(searchmed); 
					Thread.sleep(3000); 
					
					List<WebElement> medlist= this.driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']"));
					   System.out.println(medlist.size());
					 
					   
					    for(int j=0;j<medlist.size();j++) {
						   
						   if(medlist.get(j).getText().contains("WAMPOCAP")) {
							   medlist.get(j).click(); 
							   break;
							   
						   }
						   
					   } 
				  
				  
					    Thread.sleep(3000);
					    
					    WebDriverWait wait1 = new WebDriverWait(this.driver, 10);
					    WebElement fre = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtFrequency1']")));
					    fre.clear();
					    fre.click();
					    Thread.sleep(3000);
					    fre.sendKeys("3");
					    
					    
					    
					    
					    
					    Thread.sleep(3000);
					    this.driver.findElement(By.xpath("//a[@id='btnSetRules-1']")).click(); 
					    
						
						
						Thread.sleep(3000);
						WebElement selectmarker = driver.findElement(By.xpath("//select[@id='ddlMedicationMarker1-1-1']")); //select marker from drop down field
						Select dropdown1= new Select(selectmarker);	
						Thread.sleep(3000);
						dropdown1.selectByVisibleText(markf);
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//input[@id='txtMarkerDispenseAmt1-1-1']")).sendKeys(dispfamt); 
						
						 //now start with second marker
						

						Thread.sleep(3000);
						WebElement selectsecondmarker = driver.findElement(By.xpath("//select[@id='ddlMedicationMarker1-1-2']")); //select marker from drop down field
						Select dropdown2= new Select(selectsecondmarker);	
						Thread.sleep(3000);
						dropdown2.selectByVisibleText(marks);
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//input[@id='txtMarkerDispenseAmt1-1-2']")).sendKeys(dispsamt);
			   
						
						
						Thread.sleep(3000);
						WebElement selectthirdmarker = driver.findElement(By.xpath("//select[@id='ddlMedicationMarker1-1-3']")); //select marker from drop down field
						Select dropdown3= new Select(selectthirdmarker);	
						Thread.sleep(3000);
						dropdown3.selectByVisibleText(markt);
						Thread.sleep(3000);
						WebElement selectthirdmarkertime = driver.findElement(By.xpath("//select[@id='ddlTime1-1-3']")); //select marker from drop down field
						Select dropdown4= new Select(selectthirdmarkertime);	
						Thread.sleep(3000);
						dropdown4.selectByVisibleText("03:00 AM");
						

						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//input[@id='txtMarkerDispenseAmt1-1-3']")).sendKeys(disptamt);
						
						
						Thread.sleep(3000);  //aa
						this.driver.findElement(By.xpath("//input[@id='txtDateStartedTaking1']")).click();
						Thread.sleep(3000); 
						this.driver.findElement(By.xpath("//input[@id='txtDateStartedTaking1']")).sendKeys(medstartdate);
						Thread.sleep(3000); 
						this.driver.findElement(By.xpath("//input[@id='txtPillMedCount1']")).sendKeys(pcount);
			   
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//a[@id='btnSaveMedication-1']")).click();
						Thread.sleep(3000);
						jsee.executeScript("window.scrollBy(50,0)");
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//button[@id='btnSave']")).click();
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//li[@id='firstLevel']//a[@class='bradCMenu'][contains(text(),'patient table')]")).click();
					Thread.sleep(5000);
						
				
	   } 
	  

	  
  }  
	  
	  
  
 
 
  
  
  @Test(priority=2,dataProvider="getMedicationData")
  public void addmedication(String supply,String  searchmed, String freq,String markf,String dispfamt,String marks,String dispsamt,String markt,String markttime,String disptamt,String medstartdate,String pcount)  throws InterruptedException
  {
	  
	  JavascriptExecutor jsee= (JavascriptExecutor)this.driver; 
	  
	  Thread.sleep(3000L);  
	  
	  List<WebElement> patientlist=this.driver.findElements(By.xpath("//tr[@class='accordion-toggle  ']/td[1]"));  
	 
	  System.out.println(patientlist.size());
	  
	  for(int i=0;i<=3;i++) {
		 
		  boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) {
		        try {
		        	 patientlist.get(i).click(); 
		        	
		            result = true;
		           
		            break;
		          
		         
		            
		        } catch(Exception e) {
		        }
		        attempts++;
		        
		    }
		        	
		        
		    Thread.sleep(3000L);  
		  
		    List<WebElement> medbuttonlist=this.driver.findElements(By.xpath("//a[contains(text(),'Medication')]"));  
			  for(int k=1;k>=0;k--) {
					 
				  boolean result1 = false;
				    int attempts1 = 0;
				    while(attempts1 < 2) {
				        try {
				        	medbuttonlist.get(k).click();   
				        	
				            result1 = true;
				           
				            break;
				          
				         
				            
				        } catch(Exception e) {
				        }
				        attempts1++;
				        
				    }
			  }
		  
		  
			      
		    
				  
				  Thread.sleep(3000L);
				   this.driver.findElement(By.xpath("//a[contains(text(),'PATIENT Options')]")).click();
				
				  Thread.sleep(3000L);
				  
				  this.driver.findElement(By.xpath("//a[contains(text(),'Edit INFORMATION')]")).click();
				  
				 
				  Thread.sleep(3000L);
				  this.driver.findElement(By.xpath("//div[@id='div3']//span[3]//a[1]")).click(); 
				  
				  
				  Thread.sleep(3000L);
				    
				 WebElement  tcCheckbox=this.driver.findElement(By.xpath("//body/div[@id='divInmateScreensContainer']/div[@class='tab-content']/div[@id='settings']/div[@class='tab-content']/div[@id='staff-option']/div[@class='container']/form[@id='frmEditInmate']/div/div[@id='div3']/ul/li/div[@id='divMedicalInformationScreens']/div[@id='hide-social-accordion']/div[@class='panel panel-default']/div[@id='DivAllergyEdit']/div[@class='panel-body bor-none']/div[@class='table-responsive']/table[@class='edit-table table-bordered']/tbody/tr/td/label[1]"));
				 jsee.executeScript("arguments[0].scrollIntoView(true);",tcCheckbox); 
				 //boolean tcCheckIsDisplayed = tcCheckbox.isDisplayed();

	             // System.out.println("Is Terms and condition checkbox displayed: "+tcCheckIsDisplayed);
				 this.driver.findElement(By.xpath("//body/div[@id='divInmateScreensContainer']/div[@class='tab-content']/div[@id='settings']/div[@class='tab-content']/div[@id='staff-option']/div[@class='container']/form[@id='frmEditInmate']/div/div[@id='div3']/ul/li/div[@id='divMedicalInformationScreens']/div[@id='hide-social-accordion']/div[@class='panel panel-default']/div[@id='DivAllergyEdit']/div[@class='panel-body bor-none']/div[@class='table-responsive']/table[@class='edit-table table-bordered']/tbody/tr/td/label[1]")).click();
			 
				  Thread.sleep(3000L);
				  WebElement mySelectElement = driver.findElement(By.id("ddlSuppliedBy")); //select option from supplied by drop down field
					Select dropdown= new Select(mySelectElement);	
					Thread.sleep(4000);
					dropdown.selectByVisibleText(supply);
					Thread.sleep(3000L);
					
					this.driver.findElement(By.id("txtSearchMedication")).sendKeys(searchmed); 
					Thread.sleep(3000); 
					
					List<WebElement> medlist= this.driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']"));
					   System.out.println(medlist.size());
					 
					   
					    for(int j=0;j<medlist.size();j++) {
						   
						   if(medlist.get(j).getText().contains("WAMPOCAP")) {
							   medlist.get(j).click(); 
							   break;
							   
						   }
						   
					   } 
				  
				  
					    Thread.sleep(3000);
					    
					    WebDriverWait wait1 = new WebDriverWait(this.driver, 10);
					    WebElement fre = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtFrequency1']")));
					    fre.clear();
					    fre.click();
					    Thread.sleep(3000);
					    fre.sendKeys("3");
					    
					    
					    
					    
					    
					    Thread.sleep(3000);
					    this.driver.findElement(By.xpath("//a[@id='btnSetRules-1']")).click(); 
					    
						
						
						Thread.sleep(3000);
						WebElement selectmarker = driver.findElement(By.xpath("//select[@id='ddlMedicationMarker1-1-1']")); //select marker from drop down field
						Select dropdown1= new Select(selectmarker);	
						Thread.sleep(3000);
						dropdown1.selectByVisibleText(markf);
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//input[@id='txtMarkerDispenseAmt1-1-1']")).sendKeys(dispfamt); 
						
						 //now start with second marker
						

						Thread.sleep(3000);
						WebElement selectsecondmarker = driver.findElement(By.xpath("//select[@id='ddlMedicationMarker1-1-2']")); //select marker from drop down field
						Select dropdown2= new Select(selectsecondmarker);	
						Thread.sleep(3000);
						dropdown2.selectByVisibleText(marks);
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//input[@id='txtMarkerDispenseAmt1-1-2']")).sendKeys(dispsamt);
			   
						
						
						Thread.sleep(3000);
						WebElement selectthirdmarker = driver.findElement(By.xpath("//select[@id='ddlMedicationMarker1-1-3']")); //select marker from drop down field
						Select dropdown3= new Select(selectthirdmarker);	
						Thread.sleep(3000);
						dropdown3.selectByVisibleText(markt);
						Thread.sleep(3000);
						WebElement selectthirdmarkertime = driver.findElement(By.xpath("//select[@id='ddlTime1-1-3']")); //select marker from drop down field
						Select dropdown4= new Select(selectthirdmarkertime);	
						Thread.sleep(3000);
						dropdown4.selectByVisibleText("03:00 AM");
						

						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//input[@id='txtMarkerDispenseAmt1-1-3']")).sendKeys(disptamt);
						
						
						Thread.sleep(3000);  //aa
						this.driver.findElement(By.xpath("//input[@id='txtDateStartedTaking1']")).click();
						Thread.sleep(3000); 
						this.driver.findElement(By.xpath("//input[@id='txtDateStartedTaking1']")).sendKeys(medstartdate);
						Thread.sleep(3000); 
						this.driver.findElement(By.xpath("//input[@id='txtPillMedCount1']")).sendKeys(pcount);
			   
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//a[@id='btnSaveMedication-1']")).click();
						Thread.sleep(3000);
						jsee.executeScript("window.scrollBy(50,0)");
						Thread.sleep(3000);
						this.driver.findElement(By.xpath("//button[@id='btnSave']")).click();
						Thread.sleep(3000); 
						this.driver.findElement(By.xpath("//li[@id='firstLevel']//a[@class='bradCMenu'][contains(text(),'patient table')]")).click();
					Thread.sleep(3000);
						
		    System.out.println("successfully added the medications");	
	   } 
	  

	  
	  
	  
	  
  }
 
  

  
  @AfterMethod
	public void teardown(){
		this.driver.quit();
		
	}

  
  
  
}
