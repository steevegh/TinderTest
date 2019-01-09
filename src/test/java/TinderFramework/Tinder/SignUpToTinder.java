package TinderFramework.Tinder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpToTinder {
	public static WebDriver driver;
	
	
  @Test
  public void signUpToTinderAction() throws Exception {
	  LoginPage login = new LoginPage(driver);
	  login.openPage();
	  login.LoginWithFacebookAccountGetStarted();
	 
	  
	  
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
