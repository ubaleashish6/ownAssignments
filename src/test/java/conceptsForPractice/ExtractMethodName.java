package conceptsForPractice;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExtractMethodName {
	
	/*@AfterMethod
	public void getMethodName(ITestResult result){
		
		//String methodName=result.getName().toString();
		String methodName=result.getMethod().getMethodName();
		//String methodName2=result.getTestName().toString();
		System.out.println(methodName+",");		
				
	}*/
	public void getMethodName(Method method){
		
		//String methodName=result.getName().toString();
		String methodName=method.getName();
		//String methodName2=result.getTestName().toString();
		System.out.println(methodName+",");		
				
	}

}
