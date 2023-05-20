package k_Stream;

import java.util.stream.IntStream;

public class F4_MinMax {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);

        // 요소의 갯수는?
        System.out.println(stream1.count());

        // 요소 중 최대값은?
        System.out.println(stream2.max().getAsInt());
    }
}