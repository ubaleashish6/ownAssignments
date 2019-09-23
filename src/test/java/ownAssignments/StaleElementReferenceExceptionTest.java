package ownAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceExceptionTest {

	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		WebElement userID=driver.findElement(By.id("txtUsername"));
		userID.sendKeys("admin");
		Thread.sleep(5000);
		driver.navigate().refresh();
		try{
			userID=driver.findElement(By.id("txtUsername"));
			userID.sendKeys("admin");
		}
		catch(StaleElementReferenceException e){
			userID.sendKeys("admin");
		}
		
	}

}
