package D_Stream;

import java.util.Optional;

public class G2_isPresent {
	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable("�ڹ� Optional ��ü");
		Optional<String> optE = Optional.empty();
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}

		if(optE.isPresent()) {
			System.out.println(opt.get());
		}else {
			System.out.println("Empty");
		}
		
		System.out.println("1: " + optE.orElse("�� Optional ��ü"));
		System.out.println("2: " + optE.orElseGet(String::new));
		System.out.println("3: " + opt.orElseGet(String::new));
		
	}
}
