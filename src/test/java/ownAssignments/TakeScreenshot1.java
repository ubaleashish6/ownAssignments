package ownAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileUtils.copyfi
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		//FileInputStream fis=new FileInputStream(new File("/ownAssignments/src/test/java/ownAssignments/WebTable.xlsx"));
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");*/
		String date="dd/MM/yyyy";
		SimpleDateFormat sformat=new SimpleDateFormat(date);
		Date date1=new Date();
		String newDate=sformat.format(date1);
		System.out.println(newDate);

	}

}
