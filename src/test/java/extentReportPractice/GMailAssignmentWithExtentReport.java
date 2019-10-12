package extentReportPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GMailAssignmentWithExtentReport extends TestListenerAdapter {
	WebDriver driver;
	ExtentHtmlReporter htmlReport;
	ExtentReports reports;
	ExtentTest test;
	String reportPath="./Reports/Report.html";
	String screenShotFolder="./Screenshots/";
	String currentDate;
	
	@BeforeSuite
	public void init(){
		currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		htmlReport=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reports/ExtentReport_"+currentDate+".html"));
		htmlReport.config().setDocumentTitle("Automation Report");
		htmlReport.config().setReportName("Gmail Functionality");
		htmlReport.config().setTheme(Theme.DARK);
		reports=new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("OS", "Win 10");
		reports.setSystemInfo("Tester", "Ashish Ubale");
	}
	@AfterSuite
	public void flushExtent(){
		reports.flush();
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
	@AfterMethod
	public void updateExtentReport(ITestResult result) throws IOException{
		GMailAssignmentWithExtentReport obj=new GMailAssignmentWithExtentReport();
		if(result.getStatus()==ITestResult.FAILURE){
		//	obj.captureScreenshot();
			test.log(Status.FAIL, "Test Case failed: "+result.getName());
			test.log(Status.FAIL, "Failed reason is: "+result.getThrowable());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, "Test Case Passed: "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP){
			test.log(Status.SKIP, "Test Case Skipped: "+result.getName());
		}
	}
		
	@Test(priority=2)
	
	public void enterEmailIDAndClickOnNextButton(){
		test=reports.createTest("enterEmailIDAndClickOnNextButton");
		driver.findElement(By.id("identifierId")).sendKeys("ashishcybage6");
		driver.findElement(By.id("identifierNext")).click();
		
	}
	@Test(priority=3)
	public void enterPasswordAndClickOnNext() throws InterruptedException{
		test=reports.createTest("enterPasswordAndClickOnNext");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cybage@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	@Test(priority=4)
	public void clickOnComposeButton(){
		test=reports.createTest("clickOnComposeButton");
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
	}
	@Test(priority=5)
	public void markSocial() throws InterruptedException{
		test=reports.createTest("markSocial");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]")).click();
	}
	@Test(priority=6)
	public void hoverMouseOverLabelMenu() throws InterruptedException{
		test=reports.createTest("hoverMouseOverLabelMenu");
		Thread.sleep(3000);
		WebElement labelMenu=driver.findElement(By.xpath("//div[text()='Label']"));
		Actions act=new Actions(driver);
		act.moveToElement(labelMenu).build().perform();
		
	}
	@Test(priority=7)
	public void enterSocialTextAndSelect() throws InterruptedException, AWTException{
		test=reports.createTest("enterSocialTextAndSelect");
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
		test=reports.createTest("enterToEmailID");
		Thread.sleep(2000);
		driver.findElement(By.name("to")).sendKeys("ashishcybage6@gmail.com");
	}
	@Test(priority=9)
	public void enterSubject() throws InterruptedException{
		test=reports.createTest("enterSubject");
		Thread.sleep(2000);
		driver.findElement(By.name("subjectbox")).sendKeys("In regards with selenium automation");
	}
	@Test(priority=10)
	public void enterMailBodyContent() throws InterruptedException{
		test=reports.createTest("enterMailBodyContent");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("In regards with selenium automation");
	}
	@Test(priority=11)
	public void clickOnSendButton() throws InterruptedException{
		test=reports.createTest("clickOnSendButton");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
	@Test(priority=12)
	public void verifyEmailReceivedInSocialTab() throws InterruptedException{
		test=reports.createTest("verifyEmailReceivedInSocialTab");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Social']")).click();
	}
	@Test(priority=13)
	public void verifyEmailReceivedAndMarkStar() throws InterruptedException{
		test=reports.createTest("verifyEmailReceivedAndMarkStar");
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
		test=reports.createTest("openEmail");
		List<WebElement> emails=driver.findElements(By.xpath("//span[@class='bqe']"));
		//System.out.println("Total Emails: "+emails.size());
		for(WebElement email:emails){
			String emailSubject=email.getText();
			if(emailSubject.equalsIgnoreCase("In regards with selenium automation")){
				System.out.println(emailSubject);
				email.click();
			}
		}
		//Assert.assertTrue(false);
		Assert.assertEquals(driver.getTitle(), "abcccccc");
	}
	public void takeScreenShot(String folderPath){
		
	}
	public void captureScreenshot() throws IOException{
		
	}
	@Override
	public void onTestFailure(ITestResult result){
		try{
			File folder=new File(screenShotFolder);
			//String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			//System.out.println(currentDate);
			if(folder.exists()){
				//folder.mkdir();
			}
			else{
				folder.mkdir();
			}
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String srcFileName="screenshot_"+currentDate+".png";
			System.out.println(srcFileName);
			String completePath=screenShotFolder+"/"+srcFileName;
			
			FileUtils.copyFile(srcFile, new File(completePath));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
			
}
