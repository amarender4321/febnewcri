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

public class PriceSortOrder {

	private static final Object[] list = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("phones"+Keys.ENTER);
		List<WebElement> mobilesPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		ArrayList<Integer> list=new ArrayList<Integer>();

		for(WebElement prices:mobilesPrices) {

			String allMobilesPrice = prices.getText().substring(1);
			//System.out.println(allMobilesPrice);
			if(allMobilesPrice.contains(",")) 
				allMobilesPrice   	=allMobilesPrice.replace(",", "");

			int ActualMP = Integer.parseInt(allMobilesPrice);
			list.add(ActualMP);
			Collections.sort(list);
		}
		for(Integer realMP:list) {

			System.out.println(realMP);

		}


	}


}

