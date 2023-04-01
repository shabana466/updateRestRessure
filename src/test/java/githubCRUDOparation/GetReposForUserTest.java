package githubCRUDOparation;

import org.testng.annotations.Test;

import GenericLibraries.IEndPointsAndPath;

import static io.restassured.RestAssured.*;

public class GetReposForUserTest extends BaseClass {
	@Test
	public void getReposForUserTest() {
		 given()
		   .pathParam("username",property.fetchParameter("username"))
		   
		  .when()
		      .get(IEndPointsAndPath.getAllUserRepo)
		   .then()
		      .log().all()
		        .assertThat().statusCode(200);
		
		
	}

}
