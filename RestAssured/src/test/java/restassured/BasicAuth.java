package restassured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuth extends BasicAuthBaseClass {

	@Test
	public void verifyauth() {
		
		int status=RestAssured.given().
				get().getStatusCode();
		
		
		Assert.assertEquals(status, 200);
		
		
	}
	
}
