package G_Time;

import java.util.Calendar;

public class E_Quiz100DayAfter {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();
		System.out.print("����\t: ");
		System.out.println(day.getTime().toLocaleString());
		
		// TODO : ���÷κ��� 100�� �ĸ� ���ϼ���.
		long sec  = day.getTimeInMillis()/1000;
		
		System.out.print("100�� ��\t: ");
		day.setTimeInMillis(sec*1000);
		System.out.println(day.getTime().toLocaleString());
	}
}
