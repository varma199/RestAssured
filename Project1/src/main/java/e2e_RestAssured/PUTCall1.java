package e2e_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PUTCall1 {

	public static void main(String[] args) {
		
		RestAssured 
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("booking/1")
		.cookie("token", "6b0e50291d26fab")
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"firstname\" : \"Ravi\",\r\n"
				+ "    \"lastname\" : \"Teja\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.when()
				.put()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);

	}

}
