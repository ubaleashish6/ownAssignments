package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
	
	
	public static WebDriver getDriver(String browserType) {
		WebDriver driver=null;
		
		if(browserType.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
					 
		}
		
		return driver;
		
	}

}
