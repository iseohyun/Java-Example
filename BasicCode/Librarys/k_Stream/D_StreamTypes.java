package k_Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D_StreamTypes {
    public static void main(String[] args) {
        // 램던 생성된 변수4개를 받아와 출력합니다.
        System.out.println(": Print Random Numbers");
        IntStream stream = new Random().ints(4);
        stream.forEach(System.out::println);

        // 3부터 시작해서 +2씩 증가하면서 10개를 출력합니다.
        System.out.println(": Print odd Numbers");
        Stream<Integer> streamNum = Stream.iterate(3, n -> n + 2);
        streamNum = streamNum.limit(10);
        streamNum.forEach(e -> System.out.print(e + ", "));

        // 빈 Stream을 생성합니다. 갯수를 출력합니다.
        System.out.println("\n: Empty stream");
        Stream<Object> streamEmpty = Stream.empty();
        System.out.println(streamEmpty.count());
    }
}