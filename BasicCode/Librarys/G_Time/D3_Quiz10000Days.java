package G_Time;

import java.util.Calendar;

@SuppressWarnings("deprecation")
public class D3_Quiz10000Days {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();

		day.set(2000, 1 - 1, 1);
		System.out.print("唱狼 积老 \t: ");
		System.out.println(day.getTime().toLocaleString());

		// TODO : 积老肺何磐 10000老 饶甫 备窍技夸.
		long sec = day.getTimeInMillis() / 1000;
		sec += 24 * 60 * 60 * 10000;
		day.setTimeInMillis(sec * 1000);

		System.out.print("+10000老\t: ");
		System.out.println(day.getTime().toLocaleString());
	}
}