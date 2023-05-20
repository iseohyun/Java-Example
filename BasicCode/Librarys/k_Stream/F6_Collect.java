package k_Stream;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F6_Collect {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");

		// Stream을 데이터 타입으로 변경합니다.
		List<String> list = stream.collect(Collectors.toList());

		// 변경된 내용을 출력해 봅니다.
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}