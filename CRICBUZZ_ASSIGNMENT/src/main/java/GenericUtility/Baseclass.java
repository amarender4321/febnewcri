package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	WebdriverUtility webdriverUtility;
	JavaUtility javaUtility;
	FileUtility fileUtility;
	public WebDriver driver;
	@BeforeClass
	public void  launchBrowser() {
		webdriverUtility=new WebdriverUtility();
		javaUtility= new JavaUtility();
		fileUtility=new  FileUtility();
		
		           fileUtility.intiallizePropertyFile("./src/test/resources/common.Properties");
	String browser = fileUtility.getDataFromProperty("browser");
String time = fileUtility.getDataFromProperty("time");
driver=webdriverUtility.setupDriver(browser);
webdriverUtility.maximizeBrowser();
long longTime = javaUtility.convertStringToLong(time);
webdriverUtility.implicitWait(longTime);	
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void beforeMethodSetup(){
		
	String url = fileUtility.getDataFromProperty("url");
	webdriverUtility.openApplicion(url);	
	}
	
	@AfterMethod
	public void afterMethodActive() {
}
}
