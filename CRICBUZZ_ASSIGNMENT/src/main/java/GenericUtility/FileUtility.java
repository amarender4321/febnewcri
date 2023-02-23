package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	private Properties properties;
	public void intiallizePropertyFile(String propertyfilepath) {
		FileInputStream fis =null;
	
	try {
		fis =new FileInputStream(propertyfilepath);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
properties=new Properties();
	
try {
	properties.load(fis);
} catch (IOException e) {
	e.printStackTrace();
}
	}
	public  String getDataFromProperty(String key) {
		return properties.getProperty(key).trim();
		
	}
}
