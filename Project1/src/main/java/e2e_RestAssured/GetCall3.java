package e2e_RestAssured;

import io.restassured.RestAssured;

public class GetCall3 {

	public static void main(String[] args) {
		// build request
		RestAssured
			.given()
					.log()
					.all()
					.baseUri("https://restful-booker.herokuapp.com/")
					.basePath("booking/{id}")
					.pathParam("id", 1)
				.when() // hit request and get response
					.get()
				.then()// validate response
					.log()
					.all()
					.statusCode(200);

	}

}
