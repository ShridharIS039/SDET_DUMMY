package ValidateRespss;




import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class child_Objectvalidation {
@Test
	public void childvelidation() {
	baseURI="http://localhost";
	port=8084;
	when().get("projects")
	.then()
	//.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MICROSECONDS);
	
	.assertThat().body("[0].projectName",Matchers.equalTo("ASD"));
		
	}
}
