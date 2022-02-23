package k_Stream;

import java.util.stream.IntStream;

public class F2_Find {
	public static void main(String[] args) {
		IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream3 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

		System.out.println(stream1.sorted().findFirst().getAsInt());
		System.out.println(stream2.findFirst().getAsInt());
		System.out.println(stream3.sorted().findAny().getAsInt());
		System.out.println(stream4.findAny().getAsInt());
	}
}