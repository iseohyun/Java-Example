package D_Stream;

import java.util.stream.IntStream;

public class F4_MinMax {
	public static void main(String [] args) {
		IntStream stream1 = IntStream.of(30, 90, 70, 10);
		IntStream stream2 = IntStream.of(30, 90, 70, 10);
		
		System.out.println(stream1.count());
		System.out.println(stream2.max().getAsInt());
	}
}
