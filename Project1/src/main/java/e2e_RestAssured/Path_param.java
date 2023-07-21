package e2e_RestAssured;

import io.restassured.RestAssured;

public class Path_param {

	public static void main(String[] args) {
		RestAssured
		.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("{basePath}/{bookingID}")
		.pathParam("basePath", "booking")
		.pathParam("bookingID", 2)
		.when()
				.get()
		.then()
				.log()
				.all();
				
	}

}
