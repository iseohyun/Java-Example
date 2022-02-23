package k_Stream;

import java.util.stream.IntStream;

public class E5_Peek {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		
		stream.skip(2).limit(5).sorted().forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		System.out.println("=====");
		stream2.peek(s -> System.out.println("¿øº» : " + s))
			.skip(2)
			.peek(s -> System.out.println("skip(2) : " + s))
			.limit(5)
			.peek(s -> System.out.println("limit(5) : " + s))
			.sorted()
			.peek(s -> System.out.println("sorted() : " + s))
			.forEach(n -> System.out.println(n + "*"));
	}
}