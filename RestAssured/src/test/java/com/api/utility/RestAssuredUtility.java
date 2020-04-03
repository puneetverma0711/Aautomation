package com.api.utility;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;


public class RestAssuredUtility {

	
    public static String getId(){
		
		String id=RandomStringUtils.randomNumeric(4);
		return id;
	}
	
	
	public static String getName(){
		
		String name=RandomStringUtils.randomAlphabetic(4);
		return name;
	}
	
	
public static String getJob(){
		
		String job=RandomStringUtils.randomAlphabetic(5);
		return job;
	}
	
}
