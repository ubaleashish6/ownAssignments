package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtility {
	
	
	
	public static WebDriver getDriver(String browserType) {
		WebDriver driver=null;
		
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
					 
		}
		
		return driver;
		
	}

}
