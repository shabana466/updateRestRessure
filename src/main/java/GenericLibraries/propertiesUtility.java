package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtility {
	 private Properties property;
	public void propertiesInitialization(String filepath) {
		property=new Properties();
		
		try {
			property.load(new FileInputStream(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public String fetchParameter(String Key) {
		return property.getProperty(Key);
	}

}
