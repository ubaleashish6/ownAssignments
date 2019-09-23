package excelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelToHashtable {
	
	
	
	String filePath=System.getProperty("user.dir")+"/src/test/java/excelPrograms/TestData.xlsx";
	FileInputStream fis=null;
	
	XSSFWorkbook wb=null;
	XSSFSheet sheet=null;
	XSSFRow row=null;
	XSSFCell cell=null;
	Hashtable<String, String> map=new Hashtable<String, String>();
	Object data[][]=null;
	/*public ExcelToHashtable() throws IOException{
		fis=new FileInputStream(filePath);
		wb=new XSSFWorkbook(fis);
	}*/
	
	@Test
	public void firstTC() throws IOException{
		System.out.println("File Path is: "+filePath);
		fis=new FileInputStream(filePath);
		wb=new XSSFWorkbook(fis);
		Object data[][]=null;
		sheet=wb.getSheet("userinfo");
		int rowCount=sheet.getLastRowNum()+1;
		System.out.println("Total Row counts: "+rowCount);
		int count=0;
		for(int i=1;i<rowCount;i++){
			row=sheet.getRow(i);
			data=new Object[rowCount-1][1];
			
			for(int j=0;j<row.getLastCellNum();j++){
				cell=row.getCell(j);
				String key=sheet.getRow(0).getCell(j).getStringCellValue();
				String value=cell.getStringCellValue();
				map.put(key, value);
				
			}
			data[count][0]=map;
			System.out.println(data.toString());
			count++;
		}
		/*for(Map.Entry<String, String> entrySet:map.entrySet()){
			System.out.println(entrySet.getKey()+ " - "+entrySet.getValue());
		}*/
		/*for(int i=0;i<data.length;i++){
			System.out.println(data[i][0].toString());
			}*/
		
		//System.out.println(data[0][0]);
	}
	
	/*@BeforeMethod
	public void launchSite(){
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
	}*/

}
