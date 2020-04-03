package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiBase {

	
	public static RequestSpecification httprequest;
	public static Response response;
	
	
	
	
	public static void setup() {
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		httprequest=RestAssured.given();
		
		
	
		
		
	}
	
	
}
