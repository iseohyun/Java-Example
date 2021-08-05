package G_Time;

import java.util.Calendar;

public class C_Roll {
	public static void main(String [] args) {
		Calendar time1 = Calendar.getInstance();
		System.out.println(time1.getTime());
		time1.add(Calendar.SECOND, 60);
		System.out.println(time1.getTime());
		time1.roll(Calendar.SECOND, 60);
		System.out.println(time1.getTime());
	}
}
