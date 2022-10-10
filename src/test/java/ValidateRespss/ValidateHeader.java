package ValidateRespss;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ValidateHeader {
	public class GetAllProjectStaticValTest {
		@Test
		public void getAllProjectsTest(){
			String expectedPname="ASD";
		 Response response = when().get("http://localhost:8084/projects");
		 String actualPname = response.jsonPath().get("[0].projectName");
		 Assert.assertEquals(actualPname, expectedPname);
		}
		}
}
