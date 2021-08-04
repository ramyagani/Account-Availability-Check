package restassuredTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo_Post_Request {
	
	@Test
	public void postApiAutomation()
	{
	  RestAssured.baseURI = "https://reqres.in/api/users";
	  String json ="{\n"
		  		+ "    \"name\": \"Ramya\",\n"
		  		+ "    \"job\": \"tester\"\n"
		  		+ "}";
	  RestAssured.given().body(json)
//	  RestAssured.given().body("{\n"
//	  		+ "    \"name\": \"Ramya\",\n"
//	  		+ "    \"job\": \"tester\"\n"
//	  		+ "}")
	  .post()
	  .then()
	  .log()
	  .all()
	  .assertThat()
	  .statusCode(201);
	}
	

}
