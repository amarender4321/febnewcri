package ORG_TYSS_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ScoreCardPage {
	
	public ScoreCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='New Zealand Innings']/ancestor::div[@id='innings_1']/descendant::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray'][2]/following-sibling::div/div/a[@class='cb-text-link']")
	private List<WebElement> bowlerName;
	
	public String getBowlerName() {
		for(int i=0; i<bowlerName.size(); i++) {
			
		  bowlerName.get(i).getText();
		 // return bowler;
		}
		//return bowler;
		return null ;
		
	}
	
	
	
	

	}


