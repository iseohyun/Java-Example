package e_Time;

import java.util.Calendar;

@SuppressWarnings("deprecation")
public class C2_Quiz100DayAfter {
    public static void main(String[] args) {
        Calendar day = Calendar.getInstance();

        System.out.print("오늘     : ");
        System.out.println(day.getTime().toLocaleString());

        // TODO : 오늘로부터 100일 후를 구하세요.
        // long sec = day.getTimeInMillis() / 1000;
        // sec += 24 * 60 * 60 * 100;
        // day.setTimeInMillis(sec * 1000);
        day.add(Calendar.DATE, 100);

        System.out.print("100일 후 : ");
        System.out.println(day.getTime().toLocaleString());
    }
}