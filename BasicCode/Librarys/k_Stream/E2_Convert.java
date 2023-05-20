package k_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class E2_Convert {
	public static void main(String[] args) {
		// map을 통한 요소 변경
		System.out.println(": Case 1");
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		stream.map(s -> s + "(" + s.length() + ")").forEach(s -> System.out.print(s + ", "));

		// split을 통한 요소 변경
		System.out.println("\n\n: Case 2");
		String[] arr = { "I study hard", "You study JAVA", "I am hungry" };
		Arrays.stream(arr).forEach(System.out::println);
		Stream<String> stream2 = Arrays.stream(arr);
		// 정교표현식 " +"는 "빈칸이 1개이상 연속적으로 존재할 때"를 의미
		stream2.flatMap(s -> Stream.of(s.split(" +"))).forEach(e -> System.out.print(e + ", "));
	}
}