package example.of.local_time_class;

import java.time.LocalTime;

public class Test {

	public static void main(String[] args)
	{
		LocalTime now = LocalTime.now();
		LocalTime mytime = LocalTime.of(8, 45);
		
		int hour = mytime.getHour();
		int minutes = mytime.getMinute();
		int seconds = mytime.getSecond();
		int milliseconds = mytime.getNano();
		
		System.out.println("Current Time="+now);
		System.out.println("Customized Time="+hour+"-"+minutes+"-"+seconds+"-"+milliseconds);

	}

}
