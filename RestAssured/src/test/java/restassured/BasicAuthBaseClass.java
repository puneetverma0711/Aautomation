package restassured;


import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BasicAuthBaseClass {

	@BeforeTest
	public void setup() {
		
		
		RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication/";
	}
}
