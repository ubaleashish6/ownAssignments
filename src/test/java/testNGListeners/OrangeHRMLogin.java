package testNGListeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin  {
	
	static WebDriver driver=null;
	TakeScreenshotOnFail obj;
	String tcName=this.getClass().getName();
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}
	
	/*@Test
	public void loginWithValidCredentials() {
		
		//Assert.assertTrue(false);
		//driver.close();.
		/*try {
			
			obj = new TakeScreenshotOnFail();
			obj.captureScreenshot(tcName,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	@Test
	public void loginWithinvalidCredentials() {
		Assert.assertTrue(false);
	}
	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */


}
