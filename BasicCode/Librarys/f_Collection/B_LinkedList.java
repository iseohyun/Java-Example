package f_Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class B_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addAll(Arrays.asList("넷", "둘", "셋", "하나"));

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(2, "둘");
        System.out.println(list);

        list.addAll(list);
        System.out.println(list);

        System.out.println("First : " + list.getFirst());
        System.out.println("Last : " + list.getLast());
        System.out.println("리스트의 크기 : " + list.size());
    }
}