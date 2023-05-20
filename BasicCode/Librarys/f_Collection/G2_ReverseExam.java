package f_Collection;

import java.util.TreeMap;

public class G2_ReverseExam {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(30, "삼십");
        tm.put(10, "십");
        tm.put(40, "사십");
        tm.put(20, "이십");
        System.out.println(tm);

        tm.remove(40);
        System.out.println(tm);

        tm.replace(20, "twenty");
        System.out.println(tm);
    }
}