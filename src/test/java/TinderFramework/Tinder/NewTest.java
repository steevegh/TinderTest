package TinderFramework.Tinder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
WebDriver driver;
	
	@BeforeTest 
	public void beforeClass() throws IOException{
		driver = Browser.setUpChrome();
		Browser.deleteCookies(driver);
		Browser.maximizePage(driver);
	}

	@Test
	public void openTinderPage() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		driver.navigate().to("https://www.facebook.com/login.php?skip_api_login=1&api_key=464891386855067&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.8%2Fdialog%2Foauth%3Fchannel%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252Fj-GHT1gpo6-.js%253Fversion%253D43%2523cb%253Df1a89136f402888%2526domain%253Dtinder.com%2526origin%253Dhttps%25253A%25252F%25252Ftinder.com%25252Ff15bf8cebad0664%2526relation%253Dopener%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252Fj-GHT1gpo6-.js%253Fversion%253D43%2523cb%253Df349298cbd18d3c%2526domain%253Dtinder.com%2526origin%253Dhttps%25253A%25252F%25252Ftinder.com%25252Ff15bf8cebad0664%2526relation%253Dopener%2526frame%253Df1cd29a8d0ce84%26display%3Dpopup%26scope%3Duser_birthday%252Cuser_photos%252Cemail%252Cuser_friends%252Cuser_likes%26response_type%3Dtoken%252Csigned_request%26domain%3Dtinder.com%26origin%3D1%26client_id%3D464891386855067%26ret%3Dlogin%26sdk%3Djoey%26fallback_redirect_uri%3Dhttps%253A%252F%252Ftinder.com%252F%26logger_id%3D5c0edc7a-9a0b-4b77-538d-1a1bbb12092c&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2Fj-GHT1gpo6-.js%3Fversion%3D43%23cb%3Df349298cbd18d3c%26domain%3Dtinder.com%26origin%3Dhttps%253A%252F%252Ftinder.com%252Ff15bf8cebad0664%26relation%3Dopener%26frame%3Df1cd29a8d0ce84%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26e2e%3D%257B%257D&display=popup&locale=fr_FR&logger_id=5c0edc7a-9a0b-4b77-538d-1a1bbb12092c\n" + 
				"");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.id("pass")).sendKeys("test");

	}

	@AfterTest
	public void afterClass() throws IOException {
		Browser.closePage(driver);
	}
}
