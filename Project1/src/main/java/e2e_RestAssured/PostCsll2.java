package e2e_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostCsll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				RestAssured 
				.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
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
				.contentType(ContentType.JSON)
				.post()
				.then()
				.log()
				.all()
				.statusCode(200);
	}

}
