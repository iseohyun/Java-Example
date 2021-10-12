package iterator;

import java.util.Iterator;
import java.util.Set;

public class Client2 {
	public static void main(String[] args) {
		var weasleys = Set.of("Arthur", "Molly", "Bill", "Charlie", "Percy", "Fred", "George", "Ron", "Ginny");
		var family = new Family<>(weasleys);

		for (var name : family) {
			System.out.println(name + " Weasley");
		}
	}
}

class Family<E> implements Iterable<E> {
	private final Set<E> elements;

	public Family(Set<E> elements) {
		this.elements = Set.copyOf(elements);
	}

	@Override
	public Iterator<E> iterator() {
		return elements.iterator();
	}
}