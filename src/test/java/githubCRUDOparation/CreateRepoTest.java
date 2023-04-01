package githubCRUDOparation;

import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import GenericLibraries.IEndPointsAndPath;
import POJOClass.RepositoryLib;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateRepoTest extends BaseClass{
	@Test
	public void createRepoTest() {
		reponame=property.fetchParameter("reponame")+javaUtil.generateRandomNumber(100);
		RepositoryLib repoObj=new RepositoryLib(reponame,
				property.fetchParameter("description"),
				property.fetchParameter("homepage"),false);
	given()
	   .auth()
	     .oauth2(property.fetchParameter("token"))
	     .body(repoObj)
	     .contentType(ContentType.JSON)
	     .when()
	       .post(IEndPointsAndPath.postforAuthUser)
	      .then()
	        .log().all()
	           .assertThat()
	           .statusCode(201);
	           
	     
	     
	}
	

}
