package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class WeatherApiTest {
	public static Response resp;
	 @BeforeMethod
	  public void beforeMethod() {
		 
	  }
	
	
	@Test(enabled=false)
  public void verifycoordinate() {
		
		
		  
	get("http://api.openweathermap.org/data/2.5/weather?q=china&appid=494eb7495eb98ec78a7aa152144925d6").
				then().assertThat().body("coord.lon",equalTo(-99.23f));
				
	
	
		//System.out.println(value);  
		
  }
 
  
	
	@Test(enabled=false)
	  public void verifyweather() {
			
			
			  
		get("http://api.openweathermap.org/data/2.5/weather?q=china&appid=494eb7495eb98ec78a7aa152144925d6").
					then().assertThat().body("weather.main",equalTo("Clouds"));  
					
		
		
			//System.out.println(value);  
			
	  }
	
	
	
	

	@Test
	  public void verifytemprature() {
			
		RequestSpecification request=RestAssured.given();
		Response resp=request.get("http://api.openweathermap.org/data/2.5/weather?q=china&appid=494eb7495eb98ec78a7aa152144925d6");

		ResponseBody body=  resp.getBody();
		String output=body.asString();
		
		System.out.println(output);
		Assert.assertTrue(output.contains("description"));
		
		Assert.assertTrue(output.contains("lat"));
		
		JsonPath jsonPathEvaluator = resp.jsonPath();
	    // Get specific element from JSON document 
	   String str  = jsonPathEvaluator.get("weather");
	    System.out.println(str);
		
	  }
	
	
	
 

  @AfterMethod
  public void afterMethod() {
	  
  }

}
