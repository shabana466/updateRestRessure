package githubCRUDOparation;

import org.testng.annotations.Test;

import GenericLibraries.IEndPointsAndPath;

import static io.restassured.RestAssured.*;

public class DeleteRepoTest extends BaseClass{
	@Test
	public void deleteRepoTest() {
		given()
		  .pathParam("owner",property.fetchParameter("owner"))
		  .pathParam("repo",property.fetchParameter("repo"))
		  .when()
		     .delete(IEndPointsAndPath.deleteRepo)
		   .then()
		     .log().all()
		     .assertThat().statusCode(204);
		  
		
	}

}
