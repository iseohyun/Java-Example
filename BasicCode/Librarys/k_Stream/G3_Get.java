package k_Stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class G3_Get {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(4, 2, 1, 3);
		OptionalInt result = stream.findFirst();
		System.out.println(result.getAsInt());
	}
}