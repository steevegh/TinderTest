package TinderFramework.Tinder;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.WebDriver;


public class DoSwipeRightTinder{
	WebDriver driver;
	
	@BeforeTest 
	public void beforeClass() throws IOException{
	  	driver = Browser.setUpFirefox();
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		Assert.assertEquals(l.openPageTinderLogged(), "https://tinder.com/app/recs");
		MatchTinder m = new MatchTinder(driver);
		m.swipeRightTinder();

	}

	@AfterTest
	public void afterClass() throws IOException {
		Browser.closePage(driver);
	}

}
