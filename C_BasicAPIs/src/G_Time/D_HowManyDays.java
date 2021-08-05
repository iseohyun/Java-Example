package G_Time;

import java.util.Calendar;

public class D_HowManyDays {
	public static void main(String[] args) {
		Calendar getToday = Calendar.getInstance();
		System.out.println(getToday.getTime());
		
		Calendar cmpDate = Calendar.getInstance();
		cmpDate.set(1983, 9-1, 3);
		System.out.println(cmpDate.getTime());
		
		long diffSec = (getToday.getTimeInMillis() - cmpDate.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24*60*60);

		System.out.println(diffDays + "ÀÏ Â÷ÀÌ");
	}
}
