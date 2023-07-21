package json;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Simple_Json {

	
		
		@Test
		public void jsonPathDemo()
		{
			String json = "{\r\n"
					+ "  \"firstName\" : \"Ravi Teja\",\r\n"
					+ "  \"lastName\" : \"varma\",\r\n"
					+ "  \"age\" : 29,\r\n"
					+ "  \"address\" :{\r\n"
					+ "    \"flatNumber\" : 33,\r\n"
					+ "    \"Bulding name\" : \"Siri Boys hostal\",\r\n"
					+ "    \"Street Nume\" :\"2nd roda addagutta\",\r\n"
					+ "    \"state\" : \"Telangana\"\r\n"
					+ "    \r\n"
					+ "  },\r\n"
					+ "  \"salary\" : 600000,\r\n"
					+ "  \"married\" : false\r\n"
					+ "  \r\n"
					+ "}";
			
			JsonPath jp = new JsonPath(json);
			String fN = jp.getString("firstName");
			System.out.println("First name "+fN);
			
			String place = jp.getString("address");
			System.out.println(place);
			int age = jp.getInt("age");
			System.out.println("age : "+age);
			
			boolean marrageStatus = jp.getBoolean("married");
			System.out.println("got marraied :  "+ marrageStatus);
			
			float salary = jp.getFloat("salary");
			System.out.println("Salary  :"+salary);
			
			int flatNum = jp.getInt("address.flatNumber");
			System.out.println("flate number :"+flatNum);
			
			
		}
		public void jsonPath2()
		{
			String jsonArray2 = "[\r\n"
					+ "  \"10\",\r\n"
					+ "  \"20\",\r\n"
					+ "  \"30\",\r\n"
					+ "  \"40\"\r\n"
					+ "]";
			
			JsonPath jp = new JsonPath(jsonArray2);
			System.out.println(jp.getString("[3]"));
			
			
		}
	}

