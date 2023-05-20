package k_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class F2_Find {
    public static void main(String[] args) {
        int[] numbers = new int[] { 4, 2, 7, 3, 5, 1, 6 };

        // getAsInt : Optional을 int로 바꿉니다.
        IntStream stream = Arrays.stream(numbers);
        System.out.println("1> 첫번 째 : " + stream.findFirst().getAsInt());

        stream = Arrays.stream(numbers);
        System.out.println("2> 정렬 후, 첫번 째 : " + stream.sorted().findFirst().getAsInt());
    }
}