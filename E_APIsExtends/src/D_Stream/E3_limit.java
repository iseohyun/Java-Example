package D_Stream;

import java.util.stream.IntStream;

public class E3_limit {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(0, 10);
		IntStream stream1 = IntStream.range(0, 10);
		IntStream stream2 = IntStream.range(0, 10);
		IntStream stream3 = IntStream.range(0, 10);
		
		stream.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		stream1.skip(4).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		stream2.limit(5).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		stream3.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
	}
}
