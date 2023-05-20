package k_Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class E4_Sort {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
		Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

		// sorted메서드로 정렬합니다. 기본 오름차순입니다.
		stream1.sorted().forEach(s -> System.out.print(s + " "));

		// sorted메서드로 정렬합니다. 정렬기준은 Comparator.reverseOrder()'내림차순'를 따릅니다. 
		System.out.println(); 
		stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
	}
}