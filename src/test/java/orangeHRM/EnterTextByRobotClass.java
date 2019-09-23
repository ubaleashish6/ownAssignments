package orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EnterTextByRobotClass {
	
	WebDriver driver;
	
	@Test
	public void launchSite() throws AWTException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userName=driver.findElement(By.id("txtUsername"));
		Actions action=new Actions(driver);
		Robot robo=new Robot();
		//action.moveToElement(userName).build().perform();
		action.click(userName).build().perform();
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
	}

}
