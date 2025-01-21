package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractOTPFromMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message="Your OTP code is : 564545\r\n" + 
				"\r\n" + 
				"FA+9qCX9VSu";
		/*String allNum=message.replaceAll("[^0-9]","");
		String otp=allNum.substring(0,6);
		System.out.println(otp);*/
		
		
		Pattern mPattern = Pattern.compile("(|^)\\d{6}");
		String otp="";
		if(message!=null) {
		    Matcher mMatcher = mPattern.matcher(message);
                 		    if(mMatcher.find()) {
		         otp = mMatcher.group(0);
		       // Log.i(TAG,"Final OTP: "+ otp);
		    }else {
		        //something went wrong
		        //Log.e(TAG,"Failed to extract the OTP!! ");
		    }
		}
		System.out.println(otp);

	}

}
