package ownAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class GMailAssignment {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest extest;
	String reportPath="./Reports/Report.html";
	
	@BeforeSuite
	public void init(){
		reports=new ExtentReports();
	}
	
	@Parameters({"browser"})
	@BeforeTest
	public void launchChromeBrowser(String browser){
		
	/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();*/
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
	}
		
	@Test(priority=2)
	
	public void enterEmailIDAndClickOnNextButton(){
		//extest.
		driver.findElement(By.id("identifierId")).sendKeys("ashishcybage6");
		driver.findElement(By.id("identifierNext")).click();
		
	}
	@Test(priority=3)
	public void enterPasswordAndClickOnNext() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cybage@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	@Test(priority=4)
	public void clickOnComposeButton(){
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
	}
	@Test(priority=5)
	public void markSocial() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]")).click();
	}
	@Test(priority=6)
	public void hoverMouseOverLabelMenu() throws InterruptedException{
		Thread.sleep(3000);
		WebElement labelMenu=driver.findElement(By.xpath("//div[text()='Label']"));
		Actions act=new Actions(driver);
		act.moveToElement(labelMenu).build().perform();
		
	}
	@Test(priority=7)
	public void enterSocialTextAndSelect() throws InterruptedException, AWTException{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Label-as menu open']")).sendKeys("social");
		Thread.sleep(2000);
		Robot robot=new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
	}
	@Test(priority=8)
	public void enterToEmailID() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.name("to")).sendKeys("ashishcybage6@gmail.com");
	}
	@Test(priority=9)
	public void enterSubject() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.name("subjectbox")).sendKeys("In regards with selenium automation");
	}
	@Test(priority=10)
	public void enterMailBodyContent() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("In regards with selenium automation");
	}
	@Test(priority=11)
	public void clickOnSendButton() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
	@Test(priority=12)
	public void verifyEmailReceivedInSocialTab() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Social']")).click();
	}
	@Test(priority=13)
	public void verifyEmailReceivedAndMarkStar() throws InterruptedException{
		List<WebElement> emails=driver.findElements(By.xpath("//span[@class='bqe']"));
		System.out.println("Total Emails: "+emails.size());
		for(WebElement email:emails){
			String emailSubject=email.getText();
			if(emailSubject.equalsIgnoreCase("In regards with selenium automation")){
				System.out.println(emailSubject);
				By star=By.xpath("//span[text()='In regards with selenium automation']/parent::div/parent::td/preceding-sibling::td/span[1]");
				WebDriverWait wait=new WebDriverWait(driver, 10);
				/*wait.until(ExpectedConditions.invisibilityOfElementLocated(star));
				driver.findElement(star).click();*/
				Thread.sleep(5000);
				WebElement starAfterWait=wait.until(ExpectedConditions.elementToBeClickable(star));
				if(!starAfterWait.isSelected()){
					starAfterWait.click();
					break;
				}
				
			}
		}
	}
	@Test(priority=15)
	public void openEmail(){
		List<WebElement> emails=driver.findElements(By.xpath("//span[@class='bqe']"));
		System.out.println("Total Emails: "+emails.size());
		for(WebElement email:emails){
			String emailSubject=email.getText();
			if(emailSubject.equalsIgnoreCase("In regards with selenium automation")){
				System.out.println(emailSubject);
				email.click();
			}
		}
	}
			
}
