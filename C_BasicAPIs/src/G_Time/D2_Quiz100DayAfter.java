package G_Time;

import java.util.Calendar;

@SuppressWarnings("deprecation")
public class D2_Quiz100DayAfter {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();

		System.out.print("����\t: ");
		System.out.println(day.getTime().toLocaleString());

		// TODO : ���÷κ��� 100�� �ĸ� ���ϼ���.
		long sec = day.getTimeInMillis() / 1000;
		sec += 24 * 60 * 60 * 100;
		day.setTimeInMillis(sec * 1000);

		System.out.print("100�� ��\t: ");
		System.out.println(day.getTime().toLocaleString());
	}
}