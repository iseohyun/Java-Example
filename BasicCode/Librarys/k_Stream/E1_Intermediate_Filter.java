package k_Stream;

import java.util.stream.IntStream;

public class E1_Intermediate_Filter {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        // 중복 대상을 제거합니다.
        stream1.distinct().forEach(e -> System.out.print(e + " "));

        // 주어진 조건에 맞는 대상만 출력합니다.
        System.out.println();
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
    }
}