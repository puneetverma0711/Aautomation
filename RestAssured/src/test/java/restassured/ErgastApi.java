package restassured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ErgastApi {
	
	
	@BeforeMethod
	  public void beforeMethod() {
		
	  }
	
	
	
	@Test
  public void verifybodyresponse() {
		given().
		when().get("https://fakerestapi.azurewebsites.net/api/Authors").
		then().assertThat().statusCode(200).
		and().
		body("FirstName", equalToIgnoringCase("First Name 18"));   
		
		
		
  }
  
	
	

  @AfterMethod
  public void afterMethod() {
	  
  }

}
