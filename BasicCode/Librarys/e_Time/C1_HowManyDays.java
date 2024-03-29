package e_Time;

import java.util.Calendar;

public class C1_HowManyDays {
    public static void main(String[] args) {
        Calendar getToday = Calendar.getInstance();
        System.out.println(getToday.getTime());

        Calendar cmpDate = Calendar.getInstance();
        cmpDate.set(2000, 1 - 1, 1);
        System.out.println(cmpDate.getTime());

        long diffSec = (getToday.getTimeInMillis() - cmpDate.getTimeInMillis()) / 1000;
        long diffDays = diffSec / (24 * 60 * 60);

        System.out.println(diffDays + "일 차이");
    }
}