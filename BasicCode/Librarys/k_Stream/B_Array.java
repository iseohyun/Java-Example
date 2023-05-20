package k_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class B_Array {
    public static void main(String[] args) {
        String[] arr = new String[] { "넷", "둘", "셋", "하나" };

        // 모든 요소를 Stream합니다.
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.print(e + " "));

        System.out.println();

        // Stream 구간을 설정 할 수 있습니다.
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e -> System.out.print(e + " "));
    }
}