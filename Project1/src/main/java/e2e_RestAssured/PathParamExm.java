package e2e_RestAssured;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParamExm {

	public static void pathParamExm1() {
		/** 
		 * in this method  we passed base path by using individual pathParam methods
		 */
		RestAssured
		.given()
					.log()
					.all()
					.baseUri("https://restful-booker.herokuapp.com/")
					.basePath("{basepath}/{bookingID}")
					.pathParam("basepath", "booking")
					.pathParam("bookingID", 100)
		.when()
					.get()
		.then()
					.log()
					.all();
	}
	public static void pathParamExm2() {
		/**
		 * in this method we passed base path data in get method 
		 */
		RestAssured
				.given()
						.log()
						.all()
						.baseUri("https://restful-booker.herokuapp.com/")
						.basePath("{basePath}/{bookingID}")
				.when()
						.get("https://restful-booker.herokuapp.com/{basePath}/{bookingID}","booking", 120)
				.then()
						.log()
						.all(); 
		
	}
	public static void pathParamExm3() {
		/**
		 * in this method we passed path parameters by using Hash map 
		 */
		Map<String, Object> pathParameters = new HashMap<String, Object>();
		pathParameters.put("basepath", "booking");
		pathParameters.put("bookingID", 100);
		RestAssured
					.given()
							.log()
							.all()
							.baseUri("https://restful-booker.herokuapp.com/")
							.basePath("{basepath}/{bookingID}")
							.pathParams(pathParameters)
					.when()
							.get()
					.then()
							.log()
							.all(); 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pathParamExm1();
		//pathParamExm2();
		pathParamExm3();
			

	}

}
