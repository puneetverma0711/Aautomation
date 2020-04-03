package com.api.testcases;

import org.testng.annotations.Test;

import com.api.base.ApiBase;
import com.api.utility.RestAssuredUtility;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class CreateEmployeeTest extends ApiBase  {
	String id="5"+RestAssuredUtility.getId();
	String name="puneet"+RestAssuredUtility.getName();
	String job="leader"+RestAssuredUtility.getJob();
	
	@BeforeMethod
	public void sendrequest() {
		RestAssured.baseURI="http://localhost:3000";
		 ApiBase.httprequest=RestAssured.given();
		JSONObject jsonobj=new JSONObject();
		
		
		jsonobj.put("id",id );
		jsonobj.put("name", name);
		jsonobj.put("title", job);
		ApiBase.httprequest.header("Content-Type","application/json");
		ApiBase.httprequest.body(jsonobj.toJSONString());
		
		ApiBase.response=ApiBase.httprequest.request(Method.POST, "/posts/");
			
	}
	
		
		
		
	  
	
	
	@Test
  public void verifycreateUser() {
		
		String userdata=response.getBody().asString();
		System.out.println(userdata);
		Assert.assertTrue(userdata.contains(name));
		
		
		
  }
  
	


}
