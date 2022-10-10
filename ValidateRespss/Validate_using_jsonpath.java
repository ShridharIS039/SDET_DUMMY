package ValidateRespss;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Validate_using_jsonpath {
@Test
	public void validatef4() {
		Response reps=given()
				.get("http://localhost:8084/projects");
		ArrayList<Object>st=reps.jsonPath().get("projectId");
		
		//print the value
		System.out.println(st.toString());
		for(int i=0;i<st.size();i++)
		{
			System.out.println(st.get(i));
		}
	}
}
