package orangeHRM;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import bsh.This;

public class TestListener implements ITestListener {
	
	private Logger logger=Logger.getLogger(TestListener.class);
	//ScreenshotOnFailedTestCasesByUsingListener obj=new ScreenshotOnFailedTestCasesByUsingListener();
	public static int count=0;
	//public static WebDriver driver=ScreenshotOnFailedTestCasesByUsingListener.driver;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		logger.info("Test Case execution Started:");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		logger.info("Test case got failed.");
		String tcName=result.getMethod().getMethodName();
		
		try {
			captureScreenshots(tcName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void captureScreenshots(String tcName) throws IOException{
		/*Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat();
		String newDate=date.*/
		//tcName=result.getTestName();
		/*Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int minutes=cal.get(Calendar.MINUTE);
		int miliSeconds=cal.get(Calendar.MILLISECOND);
		String fileName="D:\\Selenium\\Screenshots\\"+tcName+day+"_"+month+"_"+year+"_"+hour+"_"+minutes+"_"+miliSeconds+".png";
		
		File srcFile=((TakesScreenshot)ScreenshotOnFailedTestCasesByUsingListener.driver).getScreenshotAs(OutputType.FILE);
		//File destFile=new File("D:\\Selenium\\Screenshots\\"+tcName+"_"+count+".png");
		File destFile=new File(fileName);
		FileUtils.copyFile(srcFile, destFile);
		count++;*/
		
		Date currentdate=new Date();
		
		long time=currentdate.getTime();
		Timestamp ts=new Timestamp(time);
		System.out.println("Current time: "+ts);
		String currentTimestamp=new SimpleDateFormat("dd_MM_yyyy_hh-mm-ss").format(new Date());
		
		String fileName="D:\\Selenium\\Screenshots\\"+tcName+"_"+currentTimestamp+".png";
		
		
		File srcFile=((TakesScreenshot)ScreenshotOnFailedTestCasesByUsingListener.driver).getScreenshotAs(OutputType.FILE);
		//File destFile=new File("D:\\Selenium\\Screenshots\\"+tcName+"_"+count+".png");
		File destFile=new File(fileName);
		FileUtils.copyFile(srcFile, destFile);
	}
	public static void configureLog4j(){
		PropertyConfigurator.configure("Log4j.properties");
	}

}
