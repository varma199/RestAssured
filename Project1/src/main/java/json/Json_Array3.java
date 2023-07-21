package json;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Json_Array3 {
	@Test
	public void jsonNestedArray() {
	String json = "[\r\n"
			+ "  {\r\n"
			+ "    \"firstName\": \"Ravi Teja\",\r\n"
			+ "    \"lastName\": \"varma\",\r\n"
			+ "    \"age\": 29,\r\n"
			+ "    \"address\": {\r\n"
			+ "      \"flatNumber\": 33,\r\n"
			+ "      \"Buldingname\": \"SiriBoys hostal\",\r\n"
			+ "      \"StreetNume\": \"2nd roda addagutta\",\r\n"
			+ "      \"state\": \"Telangana\"\r\n"
			+ "    },\r\n"
			+ "    \"salary\": 600000,\r\n"
			+ "    \"married\": false\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"firstName\": \"Kiren\",\r\n"
			+ "    \"lastName\": \"chandra\",\r\n"
			+ "    \"age\": 30,\r\n"
			+ "    \"address\": [\r\n"
			+ "      {\r\n"
			+ "        \"flat Number\": 32,\r\n"
			+ "        \"Bulding name\": \"Siri Boys hostal\",\r\n"
			+ "        \"Street Nume\": \"2nd roda addagutta\",\r\n"
			+ "        \"state\": \"Telangana\"\r\n"
			+ "      },\r\n"
			+ "      {\r\n"
			+ "        \"flat Number\": 3323,\r\n"
			+ "        \"Bulding name\": \"chandra Nilayam\",\r\n"
			+ "        \"Street Nume\": \"Kiren's street\",\r\n"
			+ "        \"state\": \"Telangana\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"salary\": 1200000,\r\n"
			+ "    \"married\": false\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"firstName\": \"Eswar\",\r\n"
			+ "    \"lastName\": \"Bhagavan\",\r\n"
			+ "    \"age\": 28,\r\n"
			+ "    \"address\": {\r\n"
			+ "      \"flatNumber\": 54,\r\n"
			+ "      \"Buldingname\": \"Sri Nidhi Boys hostal\",\r\n"
			+ "      \"Street Nume\": \"2nd roda addagutta\",\r\n"
			+ "      \"state\": \"Telangana\"\r\n"
			+ "    },\r\n"
			+ "    \"salary\": 550000,\r\n"
			+ "    \"married\": false\r\n"
			+ "  }\r\n"
			+ "]";	
	
	JsonPath jp = new JsonPath(json);
	String first = jp.getString("[0]");
	System.out.println("name   "+ first);
	
	String name1 = jp.getString("[0].firstName");
	System.out.println("Flalt nuber1 :  "+name1);
	
	int age1 = jp.getInt("[0].age");
	System.out.println("age   :  "+age1);
	
	String add1 =jp.getString("[0].address");
System.out.println("address 1   :   "+add1);		

String name2 = jp.getString("[1].firstName");
System.out.println("name :  "+name2);


String hostel1 = jp.getString("[0].address.Buldingname");
System.out.println("Hostel name   :  "+ hostel1);


int  falt_num1 = jp.getInt("[0].address.flatNumber");
System.out.println("Flate number1   :  "+ falt_num1);

String hostel3 = jp.getString("[2].address.Buldingname");
System.out.println("Hostel name3   :  "+ hostel3);


int  falt_num3 = jp.getInt("[2].address.flatNumber");
System.out.println("Flate number3   :  "+ falt_num3);

	
	
	
	}

}
