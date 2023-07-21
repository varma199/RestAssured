package json;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonFindFindAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Workspace\\Testing\\API\\JSON FILES\\Json_Array3file.json";
		
		File jsonFile = new File(filePath);
		System.out.println(filePath);
		JsonPath jpath = new JsonPath(jsonFile);
	//	String one = jpath.getString("[0]");
		List<String> all_first_name = jpath.getList("firstName");
		System.out.println(all_first_name);
		


	}

}
