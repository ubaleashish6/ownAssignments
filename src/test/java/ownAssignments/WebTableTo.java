package ownAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableTo {
	
	@Test
	public void handleWebTable() throws IOException{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		FileInputStream fis=new FileInputStream(new File("./ownAssignments/src/test/java/ownAssignments/WebTable.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		wb.createSheet("WebTable");
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement webTable=driver.findElement(By.id("customers"));
		List<WebElement> rows=webTable.findElements(By.tagName("tr"));
		int totalNumberOfRows=rows.size();
		System.out.println("Total Number of Rows are: "+totalNumberOfRows);
		int totalNumberOfColumns=rows.get(0).findElements(By.tagName("th")).size();
		System.out.println("Total Number of columns are: "+totalNumberOfColumns);
		//List<WebElement> totalCells=rows.get(0).findElements(By.xpath("td|th"));
		//System.out.println(totalCells.size());
		for(int i=1;i<=totalNumberOfRows;i++){
			for(int j=1;j<=totalNumberOfColumns;j++){
				String colValue=webTable.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/th["+j+"] | //table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(colValue+"  ");
			}
			System.out.println();
		}
		
	}

}
