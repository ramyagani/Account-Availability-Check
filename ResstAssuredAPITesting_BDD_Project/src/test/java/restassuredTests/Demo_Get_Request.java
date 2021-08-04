package restassuredTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class Demo_Get_Request {
	@Test
	public void getRequestAutomation()
	{
		RestAssured.baseURI = "https://reqres.in/api/users";
		Response response = RestAssured.given().param("page", "2").when().get();
	//	System.out.println(response.getBody().asString());
		System.out.println("StatusCode   "+ response.getStatusCode());
		System.out.println("ContentType   "+response.contentType());
		System.out.println("Cookies  "+response.getCookies());
		System.out.println("Time  "+response.getTime());
		System.out.println(response.prettyPrint());
		
//		RestAssured.given().param("page", "2")
//		.when()
//		.get()
//		.then()
//		.assertThat()
//		.log()
//		.all()
//		.statusCode(200);
	}

}
