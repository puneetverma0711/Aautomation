package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import org.testng.annotations.AfterMethod;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class WeatherApiTest {
	public static Response resp;
	 @BeforeMethod
	  public void beforeMethod() {
		 
	  }
	
	
	@Test
  public void verifycoordinate() {
		
		
		  
	get("http://api.openweathermap.org/data/2.5/weather?q=china&appid=494eb7495eb98ec78a7aa152144925d6").
				then().assertThat().body("coord.lon",equalTo(-99.23f));
				
	
	
		//System.out.println(value);  
		
  }
 
  
	
	@Test
	  public void verifyweather() {
			
			
			  
		get("http://api.openweathermap.org/data/2.5/weather?q=china&appid=494eb7495eb98ec78a7aa152144925d6").
					then().assertThat().body("weather.main",equalTo("Clouds"));  
					
		
		
			//System.out.println(value);  
			
	  }
	
	
 

  @AfterMethod
  public void afterMethod() {
	  
  }

}
