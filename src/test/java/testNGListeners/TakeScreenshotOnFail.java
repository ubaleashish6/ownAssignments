package testNGListeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;


public class TakeScreenshotOnFail extends OrangeHRMLogin {
	
	//WebDriver driver;
	//static int i=1;
	
	  /* public TakeScreenshotOnFail(WebDriver driver) { 
		  //super(); 
		  this.driver =  driver; 
	  }
	 */

	public static void captureScreenshot(String tcName) throws IOException {
		
		
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyyHH:mm:ss");
		 Date currentDate=new Date();
		 String date=dateFormat.format(currentDate).replaceAll("/", "");
		 date = date.replaceAll(":", "");
		 System.out.println(date); 
		 
		//driver=super.driver;
		TakesScreenshot takeScreenshot = ((TakesScreenshot)driver);
		//String tcName = this.getClass().getName();
		String folderPath = "D:\\Selenium\\workspace\\ownAssignments\\src\\test\\java\\testNGListeners\\screenshots\\";
		File targetFolder= new File(folderPath);
				//String filePath=
		if(targetFolder.exists()) {
			
		}
		else {
			targetFolder.mkdir();
		}
		String desFileName=targetFolder+"\\"+tcName+"_"+date+".png";
		//i++;
		try {
			File srcFile = takeScreenshot.getScreenshotAs(OutputType.FILE);  // new File(folderDirectory+".png");
			FileUtils.copyFile(srcFile, new File(desFileName));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
