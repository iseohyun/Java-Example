package D_Stream;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F6_Collect {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("��", "��", "�ϳ�", "��");
		List<String> list = stream.collect(Collectors.toList());
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}