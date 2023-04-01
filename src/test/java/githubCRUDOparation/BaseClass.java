package githubCRUDOparation;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GenericLibraries.IEndPointsAndPath;
import GenericLibraries.JavaUtility;
import GenericLibraries.propertiesUtility;
import static io.restassured.RestAssured.*;


public class BaseClass {
	protected propertiesUtility property;
	protected JavaUtility javaUtil;
	
	public static String reponame;
	
	@BeforeMethod
	public void methodConfig() {
		property = new propertiesUtility();
		property.propertiesInitialization(IEndPointsAndPath.propertiesPath);
		javaUtil =new JavaUtility();
		
		baseURI = "https://api.github.com";
		
		
	}
   @AfterMethod
   public void methodTearDown() {
	   Reporter.log("Request completes",true);
   }
}
