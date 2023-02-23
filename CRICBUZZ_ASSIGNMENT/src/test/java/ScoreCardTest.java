import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.Baseclass;
import ORG_TYSS_POM.HomePage;
import ORG_TYSS_POM.ScoreCardPage;

public class ScoreCardTest extends Baseclass{
	
	
	@Test
	public void scoreCardTest() {
		HomePage homepage=new HomePage(driver);
		ScoreCardPage scorecard =new ScoreCardPage(driver);
homepage.clickOnSecondMatch();
homepage.clickOnScoreCard();
//scorecard.getBowlerName(bowler);

	}
}
