package TinderFramework.Tinder;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class DoSwipeRightTinder{
	WebDriver driver;
	LoginPage l;
	MatchTinder m;
	@BeforeTest 
	public void beforeClass() throws IOException{
	  	driver = Browser.setUpFirefoxWithProfile();
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() throws InterruptedException {
		l = PageFactory.initElements(driver,LoginPage.class);
		Assert.assertEquals(l.openPageTinderLogged(), "https://tinder.com/app/recs");
		m = PageFactory.initElements(driver,MatchTinder.class);
		m.swipeRightTinder();

	}

	@AfterTest
	public void afterClass() throws IOException {
		Browser.closePage(driver);
	}

}
