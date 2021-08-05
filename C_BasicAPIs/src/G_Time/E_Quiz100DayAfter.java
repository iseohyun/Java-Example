package G_Time;

import java.util.Calendar;

public class E_Quiz100DayAfter {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();
		System.out.print("오늘\t: ");
		System.out.println(day.getTime().toLocaleString());
		
		// TODO : 오늘로부터 100일 후를 구하세요.
		long sec  = day.getTimeInMillis()/1000;
		
		System.out.print("100일 후\t: ");
		day.setTimeInMillis(sec*1000);
		System.out.println(day.getTime().toLocaleString());
	}
}
