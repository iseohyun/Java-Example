package k_Stream;

import java.util.stream.IntStream;

public class E5_Peek {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        
        // 결과를 출력합니다.
        //   최초2개 skip(7, 5 -> x),
        //   최대 5개를(5, 2, 1, 2, 3)
        //   오름차순 정렬(1, 2, 2, 3, 5)
        //   출력
        stream.skip(2).limit(5).sorted().forEach(n -> System.out.print(n + " "));
        
        System.out.println();
        System.out.println("=====");
        stream2.peek(s -> System.out.println("처리중 : " + s))
            .skip(2)
            .peek(s -> System.out.println("skip(2)이후 : " + s))
            .limit(5)
            .peek(s -> System.out.println("limit(5)대상 : " + s))
            .sorted()
            .peek(s -> System.out.println("sorted()정렬 : " + s))
            .forEach(n -> System.out.println(n + "*"));
    }
}