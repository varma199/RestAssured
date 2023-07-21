package e2e_RestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class PostCall {

	public static void main(String[] args) {
		RequestSpecification reqSpecificatrin =RestAssured.given();
		reqSpecificatrin.baseUri("https://restful-booker.herokuapp.com/");
		reqSpecificatrin=reqSpecificatrin.log().all();
		reqSpecificatrin.basePath("booking");
		reqSpecificatrin.body("{\r\n"
				+ "    \"firstname\" : \"Ravi\",\r\n"
				+ "    \"lastname\" : \"Teja\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}");
		reqSpecificatrin.contentType(ContentType.JSON);
		
		//hit post  request
		Response response = reqSpecificatrin.post();
		
		ValidatableResponse valResponse = response.then();
		valResponse = response.then().log().all();
		valResponse.statusCode(200);
		System.out.println(response);

	}

}
