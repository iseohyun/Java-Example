package D_Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D_StreamTypes {
	public static void main(String [] args) {
		IntStream stream = new Random().ints(4);
		stream.forEach(System.out::println);
		
		System.out.println("===");
		Stream<Integer> streamNum = Stream.iterate(2, n -> n + 2);
		streamNum = streamNum.limit(10);		
		streamNum.forEach(System.out::println);
		
		System.out.println("===");
		Stream<Object> streamEmpty = Stream.empty();
		System.out.println(streamEmpty.count());
	}
}
