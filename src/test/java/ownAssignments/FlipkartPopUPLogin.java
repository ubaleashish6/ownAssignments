package ownAssignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipkartPopUPLogin {

	@Test
	public void flipKartLogin(){
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		/*String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> allWindow=driver.getWindowHandles();
		int totalWindow=allWindow.size();
		System.out.println(totalWindow);
		for(String window:allWindow){
			System.out.println(window);
			driver.switchTo().window(window);
		}*/
		driver.findElement(By.cssSelector("input[class='_2zrpKA _1dBPDZ']")).sendKeys("9920665220");
	}

}
