package k_Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F7_Partition {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP", "C", "JAVASCRIPT", "PYTHON");

		// 글자수가 홀수/짝수에 따라 2개의 그룹으로 나눕니다.
		Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));

		// 홀수 그룹을 출력합니다.
		List<String> oddLengthList = patition.get(false);
		System.out.println(oddLengthList);

		// 짝수 그룹을 출력합니다.
		List<String> evenLengthList = patition.get(true);
		System.out.println(evenLengthList);
	}
}