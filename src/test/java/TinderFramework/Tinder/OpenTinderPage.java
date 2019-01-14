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
import org.openqa.selenium.support.PageFactory;

public class OpenTinderPage{
	WebDriver driver;
	LoginPage l;
	
	@BeforeTest 
	public void beforeClass() throws IOException{
		driver = Browser.setUpFirefox();
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() throws InterruptedException {
		l = PageFactory.initElements(driver,LoginPage.class);
		l.openPage();

	}

	@AfterTest
	public void afterClass() throws IOException {
		//Browser.deleteCookies(driver);
		Browser.closePage(driver);
	}

}
