package D_Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C_StreamOf {
	public static void main(String [] args) {
		Stream<Double> stream = Stream.of(1.2, 2.3, 3.4, 4.5);
		stream.forEach(System.out::println);
		
		System.out.println("===");
		IntStream stream1 = IntStream.range(1, 4);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		System.out.println("===");
		IntStream stream2 = IntStream.rangeClosed(1, 4);
		stream2.forEach(e -> System.out.print(e + " "));
	}
}
