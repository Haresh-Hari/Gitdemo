package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(d);
}
	public int getRandomNumber(int bound) {
		Random r = new Random();
		int num = r.nextInt(bound);
		return num;
		
	}
	

}
