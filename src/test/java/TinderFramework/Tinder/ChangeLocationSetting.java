package TinderFramework.Tinder;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.WebDriver;


public class ChangeLocationSetting{
	WebDriver driver;
	
	@BeforeTest 
	public void beforeClass() throws IOException{
	  	driver = Browser.setUpFirefoxWithProfile();
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		l.openPageTinderLogged();
		System.out.println(l);
		SettingPage s = new SettingPage(driver);
		s.changeGeolocation();

	}

	@AfterTest
	public void afterClass() throws IOException {
		//Browser.closePage(driver);
	}

}
