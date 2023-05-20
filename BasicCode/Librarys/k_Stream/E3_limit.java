package k_Stream;

import java.util.stream.IntStream;

public class E3_limit {
    public static void main(String[] args) {
        // 0부터 9까지 출력합니다. [0 1 2 3 4 5 6 7 8 9]
        IntStream stream = IntStream.range(0, 10);
        stream.forEach(n -> System.out.print(n + " "));


        // 첫 4개를 skip합니다. [X X X X 4 5 6 7 8 9]
        System.out.println(); 
        stream = IntStream.range(0, 10);
        stream.skip(4).forEach(n -> System.out.print(n + " "));


        // 최대 5개만 출력합니다. [0 1 2 3 4]
        System.out.println();
        stream = IntStream.range(0, 10);
        stream.limit(5).forEach(n -> System.out.print(n + " "));

        // 첫 3개를 스킵하고 5개만 출력합니다. [X X X 3 4 5 6 7]
        System.out.println();
        stream = IntStream.range(0, 10);
        stream.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
    }
}