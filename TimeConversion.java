package time_conversion_by_country;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



public class TimeConversion 
{

	public static void main(String[] args) 
	{

		//Geeting Calendar Instance 
		Calendar cd= Calendar.getInstance();
		Date date = cd.getTime();


		//Getting DateFormat Instance
        DateFormat dF = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

	    //Setting Time for Europe/London
        dF.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Time in Europe: :"); 
	    System.out.println(dF. format(date));

	    //Setting Time for Asia/Calcutta 
	    dF.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta")); 
	    System.out.println("Time in Asia::");
        System.out.println(dF.format(date));

	}
}
