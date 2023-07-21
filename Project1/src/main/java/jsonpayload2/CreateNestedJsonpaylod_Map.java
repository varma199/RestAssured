package jsonpayload2;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateNestedJsonpaylod_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> jsoneobjetPayload= new LinkedHashMap<>();
		jsoneobjetPayload.put("id", 1);
		jsoneobjetPayload.put("first_name", "Chittari");
		jsoneobjetPayload.put("last_name", "Varma");
		jsoneobjetPayload.put("marriage", false);
		jsoneobjetPayload.put("salary", 5.60);

		
		Map<String, Object> address = new LinkedHashMap<>();
		address.put("Hostel_name", "Siri Boyes Hostel");
		address.put("Room_num", 202);
		address.put("City", "Hyderabad");
		address.put("State", "Telangana");
		
		jsoneobjetPayload.put("My_address", address);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(jsoneobjetPayload)
		.get();
	}

}
