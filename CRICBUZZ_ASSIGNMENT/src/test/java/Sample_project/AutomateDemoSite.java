package Sample_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateDemoSite {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Amar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("reddy");
		//driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']")).sendKeys("Hyderbad");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bavajiamarender@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("9603146321");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s=new Select(skill);
		s.selectByIndex(2);
		/*WebElement Country = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		Select c=new Select(Country);
		c.selectByIndex(2)*/;

		


		



	}

}
