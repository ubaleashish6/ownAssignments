package faceBook_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static FileInputStream fis;
	
	public static void launchfacebook() throws IOException {
		prop=new Properties();
		try {
			fis=new FileInputStream(System.getProperty("User.dir")+"/src/test/java/faceBook_Framework/facebook.properties");
			prop.load(fis);
			String browserType=prop.getProperty("browser");
			switch(browserType) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					
				case "firfox":
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
					
				default:
					System.out.println("There is no such browser");
				
			}
			driver.get(prop.getProperty("url"));
				
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fis.close();
		}
	}

}
