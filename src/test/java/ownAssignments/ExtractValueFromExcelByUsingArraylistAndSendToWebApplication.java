package ownAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtractValueFromExcelByUsingArraylistAndSendToWebApplication {
	String filePath=System.getProperty("user.dir")+"/src/test/java/ownAssignments/WebTable.xlsx";
	WebDriver driver;
	DataFormatter formatter=new DataFormatter();
	ArrayList<String> values=new ArrayList<String>();
	
	@Test
	public void sendIntvaluetoWebPage(){
		System.out.println("Filepath= "+filePath);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(values.get(0));
		//driver.findElement(By.id("txtUsername")).sendKeys(value);
	}
	
	@BeforeTest
	public void extractDataFromExcel() throws IOException{
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Data");
		String value=formatter.formatCellValue(sheet.getRow(0).getCell(0));
		System.out.println(value);
		values.add(value);
	}

}
