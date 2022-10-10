package ValidateRespss;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StatusValidation {
	@Test
	public void statusLineValTest() {

		baseURI="http://localhost";
		port=8084;
		String expectStausLine="HTTP/1.1 200 ";
		 Response res = given()
		.get("projects");
		 	String actualStatusLine = res.getStatusLine();
		 	Assert.assertEquals(actualStatusLine, expectStausLine);
		
	}
	}

