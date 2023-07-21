package json;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Json_Array2 {
	@Test
	public void jsonArryDemo() {

		String jsonArray2 = "[\r\n"
				+ "  \"10\",\r\n"
				+ "  \"20\",\r\n"
				+ "  \"30\",\r\n"
				+ "  \"40\"\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jsonArray2);
		System.out.println(jp.getString("[3]"));
		System.out.println(jp.getList("$").size());
	}

}
