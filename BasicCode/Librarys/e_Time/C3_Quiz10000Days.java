package e_Time;

import java.util.Calendar;

@SuppressWarnings("deprecation")
public class C3_Quiz10000Days {
    public static void main(String[] args) {
        Calendar day = Calendar.getInstance();

        day.set(2000, 1 - 1, 1);
        System.out.print("나의 생일 : ");
        System.out.println(day.getTime().toLocaleString());

        // TODO : 생일로부터 10000일 후를 구하세요.
        long sec = day.getTimeInMillis() / 1000;
        sec += 24 * 60 * 60 * 10000;
        day.setTimeInMillis(sec * 1000);

        System.out.print("+10000일  : ");
        System.out.println(day.getTime().toLocaleString());
    }
}