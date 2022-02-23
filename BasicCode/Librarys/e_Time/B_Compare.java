package e_Time;

import java.util.Calendar;

public class B_Compare {
	public static void main(String[] args) {
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();

		time2.set(1983, 9, 3);
		time3.set(2030, 8, 3);

		System.out.println("Time1 : " + time1.getTime());
		System.out.println("Time2 : " + time2.getTime());
		System.out.println("Time3 : " + time3.getTime());

		System.out.println("과거: false, 미래: true");
		System.out.println(time1.before(time2));
		System.out.println(time1.before(time3));
	}
}