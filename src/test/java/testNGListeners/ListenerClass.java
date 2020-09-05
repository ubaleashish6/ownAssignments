package testNGListeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter {
	
	
	  //WebDriver driver=; 
	  /*TakeScreenshotOnFail obj; 
	  public ListenerClass(WebDriver driver) { 
		  super(); 
		  this.driver = driver; 
		  obj= new  TakeScreenshotOnFail(driver); }
	 */

	
	
	//TakeScreenshotOnFail obj= new TakeScreenshotOnFail();

	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
		System.out.println("Test case is passed....");
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		//super.onTestFailure(tr);
		System.out.println("Test case is failed....");
		try {
			TakeScreenshotOnFail.captureScreenshot(tr.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSkipped(tr);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		super.onTestStart(result);
		System.out.println("Test case is started....");
	}

}
