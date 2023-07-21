package e2e_RestAssured;

import io.restassured.RestAssured;

public class GetCall2 {

	public static void main(String[] args) {
		// bulid Request
		RestAssured
			.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/{id}")
			.pathParam("id", 1)
		//hit request and get response
		.get()
			.then()
			.log()
			.all()
	// validate response
			.statusCode(200);

	}

}
