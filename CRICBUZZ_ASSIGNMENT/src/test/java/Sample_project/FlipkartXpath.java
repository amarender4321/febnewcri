package Sample_project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartXpath {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.name("q")).sendKeys("phones"+Keys.ENTER);
 List<WebElement> mobilesNames = driver.findElements(By.xpath("//div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']"));
 //System.out.println(mobilesNames);
 ArrayList<String> al=new ArrayList<String>();
 for(int i=0; i<mobilesNames.size(); i++) {
	String NameList = mobilesNames.get(i).getText().toUpperCase();
	//System.out.println(NameList);
	
	 al.add(NameList);
 }
 Collections.sort(al);
 for(String fl:al) {
	 System.out.println(fl);
 }
	}

}
