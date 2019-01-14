package TinderFramework.Tinder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpToTinder {
	public static WebDriver driver;
	LoginPage l;
	
  @Test
  public void signUpToTinderAction() throws Exception {
	  l = PageFactory.initElements(driver, LoginPage.class);
	  l.openPage();
	  l.LoginWithFacebookAccountGetStarted();
	 
	  
	  
  }
  
  @BeforeTest 
	public void beforeClass() throws IOException{
	  	driver = Browser.setUpFirefoxWithGeoLocation();
		
		
	  	
	}

  @AfterTest
	public void afterClass() {
	  	Browser.closePage(driver);
	}
}
