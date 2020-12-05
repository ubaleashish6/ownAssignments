package ownAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsIfNoElements {
	
	WebDriver driver;
	@Test
	public void method() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		List<WebElement> list = driver.findElements(By.xpath("abcdfdfd"));
		if(list.isEmpty()) {
			System.out.println("We found these number of Elements in the list = "+list.size());
		}
	}

}

