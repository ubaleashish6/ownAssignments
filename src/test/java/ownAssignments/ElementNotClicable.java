package ownAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementNotClicable {
	@Test
	public void testElementNotClicableEvent(){
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		//driver.findElement(By.id("persistent")).click();
		
		/*//1st Way- since check box is not clickable, we are clicking on "Stay Sign in" lable
		driver.findElement(By.xpath("//label[@for='persistent']")).click();*/
		
		
		//2nd way using action class, we will have to move cursor to element and then click will work
		Actions act=new Actions(driver);
		WebElement checkBox=driver.findElement(By.id("persistent"));
		//String checkBoxLabel=checkBox.getAttribute("value");
		//System.out.println(checkBoxLabel);
		act.moveToElement(checkBox).click().build().perform();
		//act.click();
	}

}
