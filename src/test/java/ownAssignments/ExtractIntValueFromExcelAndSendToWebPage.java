package ownAssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtractIntValueFromExcelAndSendToWebPage {
	
	
	String filePath=System.getProperty("user.dir")+"/src/test/java/ownAssignments/WebTable.xlsx";
	WebDriver driver;
	DataFormatter formatter=new DataFormatter();
	
	@Test(dataProvider="data")
	public void sendIntvaluetoWebPage(String value){
		System.out.println("Filepath= "+filePath);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(value);
		//driver.findElement(By.id("txtUsername")).sendKeys(value);
		System.out.println(value);
	}
	
	@DataProvider(name="data")
	public Object[][] getDataFromExcel() throws IOException{
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Data");
		Object[][] data=new Object[1][1];
		//data[0][0]=sheet.getRow(0).getCell(0).getStringCellValue();
		String value=formatter.formatCellValue(sheet.getRow(0).getCell(0));
		data[0][0]=value;
		//data[0][0]=sheet.getRow(0).getCell(0).getNumericCellValue();
		//System.out.println(data[0][0].toString());
		return data;
			
	}
	public static String intToString(String integerValue){
		Double dval= Double.valueOf(integerValue);
		int num=dval.intValue();
		return new Integer(num).toString();
	}

}
