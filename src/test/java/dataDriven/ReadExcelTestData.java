package dataDriven;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReadExcelTestData {
	
	WebDriver driver=null;
	
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		List<Map<String, String>> testData= ReadExcelDataUsingMap.getDataFromExcelIntoMap();
		driver=BrowserUtility.getDriver("Chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(testData.get(0).get("SearchText"));
		Thread.sleep(5000);
		
	}
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		List<Map<String, String>> testData= ReadExcelDataUsingMap.getDataFromExcelIntoMap();
		driver=BrowserUtility.getDriver("Chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(testData.get(1).get("SearchText"));
		Thread.sleep(5000);
		
	}
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		List<Map<String, String>> testData= ReadExcelDataUsingMap.getDataFromExcelIntoMap();
		driver=BrowserUtility.getDriver("Chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(testData.get(2).get("SearchText"));
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
