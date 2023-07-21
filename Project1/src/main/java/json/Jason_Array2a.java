package json;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
@Test
public class Jason_Array2a {
	
	public void jsonArrayDemo() {
		String jsonArray2 = "[\r\n"
				+ "  [\r\n"
				+ "    \"10\",\r\n"
				+ "    \"20\",\r\n"
				+ "    \"30\",\r\n"
				+ "    \"40\"\r\n"
				+ "  ],\r\n"
				+ "  [\r\n"
				+ "    \"200\",\r\n"
				+ "    \"300\",\r\n"
				+ "    \"400\",\r\n"
				+ "    \"500\",\r\n"
				+ "    \"600\"\r\n"
				+ "  ]\r\n"
				+ "]";
		
		
		JsonPath jp = new JsonPath(jsonArray2);
		System.out.println(jp.getString("[1][4]"));
		System.out.println(jp.getString("[0][1]"));
		System.out.println(jp.getList("$").size());
		
		
		
		
	}

}
