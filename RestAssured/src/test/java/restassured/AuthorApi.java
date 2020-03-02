package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AuthorApi {
	public static Response resp;
	@BeforeMethod
	  public void beforeMethod() {
		resp=RestAssured.get("https://fakerestapi.azurewebsites.net/api/Authors");
		
	  }
	
	
	
	@Test
  public void verifystatuscode() {
		
		 int status=resp.getStatusCode();
		 Assert.assertEquals(status, 200);    
		
  }
  
	
	@Test
	  public void verifyresponsetime() {
			
			 long time=resp.getTime();
			
			 if(time<2000) {
				 Assert.assertTrue(true, "response is under 2000 miliseconds");
				 
			 }else {
				 Assert.assertTrue(false, "response is over 2000 miliseconds");
				 
			 }
			 
			
			
	  }
	  
	
	
	@Test
	  public void verifyresponse() {
			
			 String data=resp.asString();
			 System.out.println(data);
			 
			 
			
	  }
	  
	

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
  }
  
  
  

}
