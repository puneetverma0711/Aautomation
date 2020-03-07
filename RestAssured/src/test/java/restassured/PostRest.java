package restassured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRest {

	@Test
	public void verifypost() {
		
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject json=new JSONObject();
		json.put("id","15");
		json.put("title", "test125");
		json.put("author", "test125");
		
		request.body(json.toJSONString());
		
		Response resp=request.post("http://localhost:3000/posts");
		
		int status=resp.getStatusCode();
		Assert.assertEquals(status, 201);
		
		
	}
	
}
