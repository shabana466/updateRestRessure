package githubCRUDOparation;

import org.testng.annotations.Test;

import GenericLibraries.IEndPointsAndPath;

import static io.restassured.RestAssured.*;

public class SearchReposTest extends BaseClass {
	@Test
	public void searchReposTest() {
		given()
		  .queryParam("q",property.fetchParameter("reposName"))
		  .queryParam("sort",property.fetchParameter("sort"))
		  .when()
		  .get(IEndPointsAndPath.searchRepos)
		  .then()
		     .log().all()
		     .assertThat()
		         .statusCode(200);
		  
	
	}

}
