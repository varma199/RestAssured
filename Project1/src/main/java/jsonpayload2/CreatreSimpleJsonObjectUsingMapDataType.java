package jsonpayload2;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreatreSimpleJsonObjectUsingMapDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> jsoneobjetPayload= new HashMap<>();
		jsoneobjetPayload.put("id", "1");
		jsoneobjetPayload.put("first_name", "Chittari");
		jsoneobjetPayload.put("last_name", "Varma");
		jsoneobjetPayload.put("marriage", "false");
		jsoneobjetPayload.put("salary", "5.60");
		
		
		RestAssured
			.given()
			.log()
			.all()
			.body(jsoneobjetPayload)
			.get();
	}

}
