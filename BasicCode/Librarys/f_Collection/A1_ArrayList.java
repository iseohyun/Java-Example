package f_Collection;

import java.util.ArrayList;

public class A1_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("넷");
        list.add("둘");
        list.add("셋");
        list.add("하나");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.addAll(list);
        System.out.println(list);

        list.removeAll(list);
        list.add("하나");
        System.out.println(list);

        System.out.println("리스트의 크기 : " + list.size());
    }
}