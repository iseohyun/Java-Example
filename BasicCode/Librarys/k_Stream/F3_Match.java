package k_Stream;

import java.util.stream.IntStream;

public class F3_Match {
    public static void main(String[] args) {
        // 80 이상인 요소가 있습니까?
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream1.anyMatch(n -> n > 80));

        // 모든 요소가 80이 넘습니까?
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream2.allMatch(n -> n > 80));

        // 모든 요소가 80이 넘습니까?
        IntStream stream3 = IntStream.of(81, 90, 100, 110);
        System.out.println(stream3.allMatch(n -> n > 80));
    }
}