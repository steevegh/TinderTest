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
		driver = Browser.setUpChrome();
		Browser.deleteCookies(driver);
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() {
		LoginPage l = new LoginPage(driver);
		l.openPage();

	}

	@AfterTest
	public void afterClass() throws IOException {
		Browser.closePage(driver);
	}

}
