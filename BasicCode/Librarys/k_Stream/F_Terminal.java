package k_Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class F_Terminal {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("��", "��", "��", "�ϳ�");
		Stream<String> stream2 = Stream.of("��", "��", "��", "�ϳ�");
		Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
		result1.ifPresent(System.out::println);
		String result2 = stream2.reduce("����", (s1, s2) -> s1 + "++" + s2);
		System.out.println(result2);
	}
}
