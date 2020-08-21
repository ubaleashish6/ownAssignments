package dataDriven;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestUsingDataProvider {
	WebDriver driver=null;
	@Test(dataProvider="getTestData")
	public void searchOnGoogleBasedOnData(Map<Object, Object> tData) throws InterruptedException {
		driver=BrowserUtility.getDriver("Chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys((String)tData.get("SearchText"));
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="getTestData")
	public static Object[][] getTestData(){
		
		Object[][] data=null;
		
		List<Map<String,String>> testData=ReadExcelDataUsingMap.getDataFromExcelIntoMap();
		data=new Object[testData.size()][1];
		for(int i=0;i<testData.size();i++) {
			data[i][0]=testData.get(i);
		}
		
		return data;
	}

}
