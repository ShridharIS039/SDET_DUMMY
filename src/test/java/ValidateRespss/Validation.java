package ValidateRespss;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.response.Response.*;

import java.util.List;


public class Validation {
	@Test
	public void getAllProjectsTEst() {
	String baseURI="http://localhost";
		int port=8084;
		String expectpId="TY_PROJ_001";
		 Response res = when().get("projects");
		 List<String> actulPid = res.jsonPath().get("projectId");
		 Boolean flag= false;
		 for (String aID : actulPid) {
			 if(aID.equalsIgnoreCase(expectpId)) {
				 System.out.println("project id is found");
				 flag=true;
			 }
			
		}
		 Assert.assertTrue(flag);
	}
}
