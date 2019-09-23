package orangeHRM;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import bsh.This;

public class ScreenshotOnFailedTestCasesByUsingListener extends TestListenerAdapter {
	
	private Logger logger=Logger.getLogger(ScreenshotOnFailedTestCasesByUsingListener.class);
	public static WebDriver driver;
	public static int count=0;
	
	/*public ScreenshotOnFailedTestCasesByUsingListener(){
		PropertyConfigurator.configure("Log4j.properties");
	}*/
	
	@Test(priority=1)
	public void launchHRMSite(){
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Launching browser and site......");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority=2)
	public void login() throws InterruptedException{
		
		logger.info("logging to application........");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed()==true);
		Thread.sleep(5000);
		
	}
	@Test(priority=3)
	public void verifyAssignLeavePage() throws InterruptedException{
		logger.info("verifying assign leave page...");
		driver.findElement(By.xpath("//span[@class='quickLinkText'][text()='Assign Leave']")).click();
		Assert.assertTrue((driver.findElement(By.xpath("//h1[text()='Assign Leave']")).isDisplayed())==false);
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void verifyLeaveListPage(){
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		Assert.assertTrue((driver.findElement(By.xpath("//h1[text()='Leave List']")).isDisplayed())==false);
	}
	/*public static void captureScreenshots() throws IOException{
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat();
		String newDate=date.
		//tcName=result.getTestName();
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\Selenium\\Screenshots\\Screenshot_"+count+".png");
		FileUtils.copyFile(srcFile, destFile);
		count++;
		
	}*/
	
}
