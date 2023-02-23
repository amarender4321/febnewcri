package Sample_project;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTubeSongs {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		WebElement searchbox = driver.findElement(By.name("search_query"));
		searchbox.sendKeys("Gulabi kallu rendu");
		driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']/a[@href='/watch?v=YR12Z8f1Dh8']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
