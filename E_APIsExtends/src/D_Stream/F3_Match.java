package D_Stream;

import java.util.stream.IntStream;

public class F3_Match {
	public static void main(String[] args) {
		IntStream stream1 = IntStream.of(30, 90, 70, 10);
		IntStream stream2 = IntStream.of(30, 90, 70, 10);
		IntStream stream3 = IntStream.of(81, 90, 100, 110);

		System.out.println(stream1.anyMatch(n -> n > 80));
		System.out.println(stream2.allMatch(n -> n > 80));
		System.out.println(stream3.allMatch(n -> n > 80));
	}
}