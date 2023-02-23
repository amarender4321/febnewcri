package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility {
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	/**
	 * This method is used to setup the driver instance
	 * @param browser
	 * @return
	 */
	public WebDriver setupDriver(String browser)
	{
		switch (browser) {
		
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;		
		case "ie":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		break;
		
		
	default :
		System.out.println("You entered wrong key in the property file");
		break;
		}
		return driver;
		
	}
	
	
	/**
	 * This method is used to maximaize the browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	/**
	 * This method  is used to  wait the page by using implicit wait
	 * @param longTimeout
	 */
	public void implicitWait(long longTimeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}
	
	/**
	 * This browser is used to navigate the application
	 */
	
	public void openApplicion(String url) {
		driver.get(url);
	}
	
	/**
	 * This method is used to initialize the application
	 * @param url
	 */
	public void intiallizeActions() {
		act= new Actions(driver);
	}
	/**
	 * this method is used to Mouse hover on Element
	 * @param element
	 */
	public void mouseHoverOnElement(WebElement element) {
		act.moveToElement(element).perform();
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void explicitWait(WebElement locator)
	{
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	
	
	public void intiallizeExplicitWait(long timeOuts, long pollingTime) {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(pollingTime));
		wait.pollingEvery(Duration.ofMillis(pollingTime));
		wait.ignoring(Exception.class);
	}
	/**
	 * This method is used to close particular Tab
	 */
	public void closeTab() {
		driver.close();
	}

}
