package G_Time;

import java.util.Calendar;

public class A_Time {
	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		System.out.println(time.getTime());
		time.add(Calendar.MONTH, 1);
		System.out.println(time.getTime());
		time.add(Calendar.DATE, 1);
		System.out.println(time.getTime());
		time.add(Calendar.HOUR, -1);
		System.out.println(time.getTime());
		time.set(Calendar.MINUTE, 30);
		System.out.println(time.getTime());
		time.set(Calendar.SECOND, 30);
		System.out.println(time.getTime());
	}
}