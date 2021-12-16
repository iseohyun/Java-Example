package B_Lambda;

import java.util.Arrays;
import java.util.List;

public class E_DblColon {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("±è°©¼ø", "±è°©µ¹");
		names.forEach(x -> System.out.println(x));
		names.forEach(System.out::println);
	}
}