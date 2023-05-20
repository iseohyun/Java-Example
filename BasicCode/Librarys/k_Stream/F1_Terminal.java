package k_Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class F1_Terminal {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        
        // reduce는 하나의 값으로 축소합니다.
        // Optional은 값이 존재하지 않는 경우를 대비해서, Java8부터 도입된 클래스입니다.
        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + ", " + s2);
        result1.ifPresent(System.out::println);

        // result2는 첫 번째 인자값이 됩니다. 따라서 값은 반드시 존재합니다.
        String result2 = stream2.reduce("resualt2", (s1, s2) -> s1 + ": " + s2);
        System.out.println(result2);
    }
}
