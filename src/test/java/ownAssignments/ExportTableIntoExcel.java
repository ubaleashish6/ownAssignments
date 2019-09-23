package ownAssignments;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExportTableIntoExcel {
	
	@Test
	public void exportWebTableDataIntoExcelTest() throws IOException{
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		//FileInputStream fis=new FileInputStream(new File("/ownAssignments/src/test/java/ownAssignments/WebTable.xlsx"));
		
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
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sh=wb.createSheet("WebTable");
		for(int i=1;i<=totalNumberOfRows;i++){
			XSSFRow row=sh.createRow(i-1);
			for(int j=1;j<=totalNumberOfColumns;j++){
				XSSFCell cell=row.createCell(j-1);
				String colValue=webTable.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/th["+j+"] | //table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(colValue+"  ");
				cell.setCellValue(colValue);
			}
			System.out.println();
		}
		//File excelFile=new File("WebTable.xlsx");
		//String filePath=System.getProperty("user.dir")+"\\ownAssignments\\src\\test\\java\\ownAssignments\\WebTable.xlsx";
		String filePath="D:\\Selenium\\Workspaces\\workspace1\\ownAssignments\\src\\test\\java\\ownAssignments\\WebTable.xlsx";
		
		FileOutputStream out=new FileOutputStream(new File(filePath));
		wb.write(out);
		out.close();
		//wb.close();
	
	}

}
