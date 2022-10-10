package ValidateRespss;

import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class GetAllProject {
@Test
	public void getallproject() {
		when()
		.get("http://localhost:8084/projects")
		.then()
	    .log().all()
	    .and();
		
		assertThat()
		.statuscode(200);
		
		
		
		
		
	}


	
}
