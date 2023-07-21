package e2e_RestAssured;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRestponseTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Response response= RestAssured.given()
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
		.when()
			.post();
		
		long time_in_ms= response.time();
		System.out.println("Response time in MS : "+time_in_ms);
		
		long time_in_sec= response.timeIn(TimeUnit.SECONDS);
		System.out.println("Response time in Sec : "+time_in_sec);
	
		long time_in_ms2 = response.getTime();
		System.out.println("Response time in MS-2 : "+time_in_ms2);
		
		long time_in_sec2 =response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in Sec-2 : "+time_in_sec2);
		
		response.then().time(Matchers.lessThan(5000L)); 	
		response.then().time(Matchers.greaterThan(1000L));
		response.then().time(Matchers.both(Matchers.lessThan(5000L)).and(Matchers.greaterThan(1000L)));
		response.then().time(Matchers.lessThan(5L), TimeUnit.SECONDS);
	}

}
