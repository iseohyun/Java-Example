package D_Stream;

import java.util.NoSuchElementException;
import java.util.Optional;

public class G_Optional {
	public static void main(String[] args) {
		String str = "Java", strNull = null;
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt.get());
		
		opt = Optional.ofNullable(strNull);
		try {
			System.out.println(opt.get());
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		System.out.println("=====");
		try {
			opt = Optional.of(strNull);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
