package githubCRUDOparation;

import org.testng.annotations.Test;

import GenericLibraries.IEndPointsAndPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import java.util.Properties;

public class GetReposForAuthUserTest extends BaseClass{
	@Test
	public void getReposForAuthUserTest() {
		
 
			 given()
			    .auth().oauth2(property.fetchParameter("token"))
		    .when()
			  .get(IEndPointsAndPath.getRepoForAuthUser)
			 .then()
			      .log().all()
			      .assertThat()
			         .statusCode(200)
			           .contentType(ContentType.JSON);
	                 // String name = response.jsonPath().get("name");
	                  //Assert.assertEquals
	                  
			  
		  
		
	}

}
