package ownAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DatePicker_MakeMyTrip {
	
	WebDriver driver;
	String xPath="//label[@for='departure']";
	
	@Test
	public void testDatePicker(){
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(xPath)).click();
		for(int i=1;i<12;i++){
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();;
			String month=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
			if(month.contains("December")){
				driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).click();
				break;
			}
		}
		
		List<WebElement> dateList=driver.findElements(By.xpath("//div[@class='dateInnerCell']/p"));
		for(WebElement ele: dateList){
			String date=ele.getText();
			System.out.println(date);
			if(date.equals("31")){
				
				ele.click();
				break;
			}
			
		}
	}

}
