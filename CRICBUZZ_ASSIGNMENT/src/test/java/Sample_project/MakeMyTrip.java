package Sample_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.id("fromCity")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderbad");
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	driver.findElement(By.xpath("//p[.='Rajiv Gandhi International Airport']")).click();
	driver.findElement(By.xpath("//input[@id='toCity']")).click();
    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
    driver.findElement(By.xpath("//a[text()='Search']")).click();
	
	
	
	
	}

}
