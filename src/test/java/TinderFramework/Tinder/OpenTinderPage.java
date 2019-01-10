package TinderFramework.Tinder;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTinderPage{
	WebDriver driver;
	
	@BeforeTest 
	public void beforeClass() throws IOException{
		driver = Browser.setUpChromeProfileTinderLogged();
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() throws InterruptedException {
		//LoginPage l = new LoginPage(driver);
		//l.openPage();

	}

	@AfterTest
	public void afterClass() throws IOException {
		Browser.deleteCookies(driver);
		//Browser.closePage(driver);
	}

}
