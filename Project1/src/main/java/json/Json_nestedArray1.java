package json;

import io.restassured.path.json.JsonPath;

public class Json_nestedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstName\" : \"Ravi\",\r\n"
				+ "    \"lastname\" : \"Varma\",\r\n"
				+ "    \"age\": 29,\r\n"
				+ "    \"address\" : [\r\n"
				+ "      {\r\n"
				+ "        \"city\" : \"Koilkuntla\",\r\n"
				+ "        \"State\" : \" AP\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "       \"city\" : \"Hyd\",\r\n"
				+ "        \"State\" : \"TG\" \r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstName\" : \"Sudheer\",\r\n"
				+ "    \"lastname\" : \"Varma\",\r\n"
				+ "    \"age\": 26\r\n"
				+ "  }\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(json);
		String city1 = jp.getString("[0].address[0].city");
		System.out.println("city :  "+city1);
		
		String city2_1 = jp.getString("[0].address[1].city") ;
		System.out.println("city 1-2    : "+city2_1);
		
		String firstname2 = jp.getString("[1].firstName");
		System.out.println("first name 2 :   "+ firstname2);
		
		
		

	}

}
