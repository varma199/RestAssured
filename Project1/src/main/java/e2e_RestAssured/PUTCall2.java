package e2e_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PUTCall2 {
	public static String generateToken() {
		String body = RestAssured
		.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"username\" : \"admin\",\r\n"
						+ "    \"password\" : \"password123\"\r\n"
						+ "}")
		.when()
				.post()
		.then()
				.extract()
				.body()
				.asString();
		System.out.println(body);
		return body;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateToken();
	}

}
