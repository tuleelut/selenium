package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DataPreparation {

	@Test
	void prepareTestData() {
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		String payload = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}"; 	
		int employeeId = RestAssured.
		            given()
		            .body(payload)
		            .post("/api/v1/create").body().jsonPath().get("data.id");
		
		System.out.print(employeeId);
	}
}
