package B_Lambda;

import java.util.Arrays;
import java.util.List;

public class E2_AddString {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("±è°©¼ø", "±è°©µ¹");

		E2_AddString dct = new E2_AddString();
		names.stream().map(x -> dct.addNim(x)).forEach(System.out::println);
		names.stream().map(dct::addNim).forEach(System.out::println);
	}

	public String addNim(String s) {
		return s + "´Ô";
	}
}