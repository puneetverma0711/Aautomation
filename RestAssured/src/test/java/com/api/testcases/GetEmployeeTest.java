package com.api.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.ApiBase;

import io.restassured.http.Method;

public class GetEmployeeTest extends ApiBase {
  public static String  employeedata;
	
	@BeforeMethod
	public void sendrequest() {
	setup();
	ApiBase.response=ApiBase.httprequest.request(Method.GET, "/employees");
		
	}
	
	
	@Test
  public void getAllEmployees() {
  
		employeedata=ApiBase.response.getBody().asString();
		System.out.println(employeedata);
		   
		
	}

	
	
	


}
