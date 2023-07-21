package e2e_RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Multiple_functions {

	RequestSpecification requestSpecificatin;
	@BeforeClass
	public void setUpRequestSpecification() {
		requestSpecificatin = RestAssured.given();
		requestSpecificatin.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.contentType(ContentType.JSON);
	}
	
	@Test
	public void postCall() {
		RestAssured.given()
		.spec(requestSpecificatin)
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
		.post()
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	@Test
	public void update() {
		RestAssured.given()
		.spec(requestSpecificatin)
		.basePath("booking/100")
		.cookie("token", "ff4500f61c5ea15")
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
		.statusCode(200);
	}

}
