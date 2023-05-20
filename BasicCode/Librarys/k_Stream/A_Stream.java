package k_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class A_Stream {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 각 요소를 스트림으로 변환합니다.
        Stream<Integer> stream = list.stream();
        
        stream.forEach(System.out::println);
    }
}