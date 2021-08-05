package D_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class B_Array {
	public static void main(String[] args) {
		String[] arr = new String[]{"��", "��", "��", "�ϳ�"};
		Stream<String> stream1 = Arrays.stream(arr);
		
		stream1.forEach(e -> System.out.print(e + " "));
		
		System.out.println();
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(e -> System.out.print(e + " "));
	}
}
