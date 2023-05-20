package k_Stream;

import java.util.Optional;

public class G2_isPresent {
	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
		Optional<String> optE = Optional.empty();

		// isPresent는 값이 존재하는지를 알기 위한 목적으로 사용
		// 정상출력
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}

		// 빈 객체
		if (optE.isPresent()) {
			System.out.println(opt.get());
		} else {
			System.out.println("Empty");
		}

		System.out.println("1: " + optE.orElse("빈 Optional 객체"));
		System.out.println("2: " + optE.orElseGet(String::new));
		System.out.println("3: " + opt.orElse("빈 Optional 객체"));
		System.out.println("4: " + opt.orElseGet(String::new));

	}
}