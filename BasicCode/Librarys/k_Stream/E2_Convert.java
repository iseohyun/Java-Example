package k_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class E2_Convert {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		stream.map(s -> s.length()).forEach(System.out::println);

		System.out.println("====");
		String[] arr = { "I study hard", "You     study JAVA", "I am    hungry" };
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
	}
}