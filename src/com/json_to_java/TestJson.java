package com.json_to_java;

import java.io.StringWriter;

import org.codehaus.jackson.map.ObjectMapper;

public class TestJson {
	public static String JSON_OBJ = "{" + "\"id\" : 101, " + "\"name\" : \"Anant Kshirsagar\"," + "\"percentage\" : 80.88"
			+ "}";

	public static void main(String[] args) {
		convertJsonToJava();
		convertJavaToJson();
	}
	
	public static void convertJavaToJson(){
		try {
			StudentEntity studentEntity = new StudentEntity();
			studentEntity.setId(111);
			studentEntity.setName("Suyog");
			studentEntity.setPercentage(80.00f);
			ObjectMapper javaObjectMapper = new ObjectMapper();
			StringWriter jsonObj = new StringWriter();
			javaObjectMapper.writeValue(jsonObj, studentEntity);
			System.out.println(jsonObj);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void convertJsonToJava(){
		try {
			ObjectMapper jsonObjectMapper = new ObjectMapper();
			StudentEntity studentEntity = new StudentEntity();
			studentEntity = jsonObjectMapper.readValue(JSON_OBJ, StudentEntity.class);
			
			System.out.println(" ID: " +studentEntity.getId());
			System.out.println(" NAME: " +studentEntity.getName());
			System.out.println(" PERCENTAGE: " +studentEntity.getPercentage());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
