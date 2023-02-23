package ORG_TYSS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='cb-mat-mnu-itm cb-ovr-flo' and contains(.,'Won')][1]")
private WebElement SecondMatch;

@FindBy(xpath="//a[text()='Scorecard']")
private WebElement ScoreCardLink;

public void clickOnSecondMatch() {

	SecondMatch.click();
}
public void clickOnScoreCard() {
	ScoreCardLink.click();
}
}
