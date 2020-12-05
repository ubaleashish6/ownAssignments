package ownAssignments;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_MakeMyTrip {
	
	WebDriver driver;
	String xPath="//label[@for='departure']";
	
	@Test
	public void testDatePicker(){
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(xPath)).click();
		try {
			for(int i=1;i<12;i++){
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();;
				String month=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
				if(month.contains("November")){
					driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).click();
					break;
				}
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("No such month");
		}
		
		List<WebElement> dateList=driver.findElements(By.xpath("//div[@class='dateInnerCell']/p"));
		try {
			for(WebElement ele: dateList){
				String date=ele.getText();
				System.out.println(date);
				if(date.equals("31")){
					
					ele.click();
					break;
				}
			}	
		}
		catch(NoSuchElementException e) {
			System.out.println("Particular date does not exist for selected month, please select correct one..");
		}	
		
	}

}
