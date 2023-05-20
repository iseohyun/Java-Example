package f_Collection;

import java.util.TreeSet;

public class F2_Tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(6);
        ts.add(4);
        ts.add(3);
        ts.add(5);
        ts.add(8);
        ts.add(7);
        ts.add(9);
        System.out.println(ts);

        ts.remove(4);
        System.out.println(ts);

        System.out.println("이진 검색 트리의 크기 : " + ts.size());
        System.out.println(ts.subSet(4, 8));
        System.out.println(ts.subSet(5, false, 8, true));
    }
}