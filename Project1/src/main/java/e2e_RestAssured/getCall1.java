package e2e_RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class getCall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//build request
		RequestSpecification reqSpecification = RestAssured.given().log().all();
		reqSpecification.baseUri("https://restful-booker.herokuapp.com/");
		reqSpecification.basePath("booking/{id}");
		reqSpecification.pathParam("id", 1);
		//hit request and get response
		Response response = reqSpecification.get();
		//validate response
		ValidatableResponse valResponse = response.then().log().all();
		valResponse.statusCode(200);

	}

}
