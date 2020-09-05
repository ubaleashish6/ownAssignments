package dateConcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		/*String mydate="20/1/2016";
		SimpleDateFormat dfmt = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dfmt.parse(mydate);
		System.out.println(date);
		String newdate = dfmt.format(date);
		System.out.println(newdate); */
		
		 //==========Using DateTimeFormatter class=============================
		/*
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 * LocalDateTime now = LocalDateTime.now(); System.out.println(dtf.format(now));
		 */
		 //==========Using simpleDateFormat class=============================
		 SimpleDateFormat sf=new SimpleDateFormat("dd/MMM/yyyyHH:mm:ss");
		 Date todayDate=new Date();
		 sf.format(todayDate);
		 System.out.println(sf.format(todayDate));
		 System.out.println(sf.format(todayDate).replaceAll("/", ""));  
		//==========Using Calendar class=============================  
		 SimpleDateFormat sf1=new SimpleDateFormat("dd/MM/yyyyHH:mm:ss");
		 Calendar cal= Calendar.getInstance();
		 System.out.println(sf.format(cal.getTime()));

	}

}
