package B_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class D2_Combine {
	public static void main(String[] args) {
		// 1 : init
		List<Fruit> origin = Arrays.asList(
				new Fruit("Apple", "Red"), 
				new Fruit("Orange", "Orange"), 
				new Fruit("banana", "yellow"),
				new Fruit("Orange", "Orange"),
				new Fruit("Strawberry", "Red"),
				new Fruit("Apple", "Green"),
				new Fruit("Apple", "White"),
				new Fruit("Cherry", "Red"));
		List<Fruit> apple = new ArrayList<>();
		List<Fruit> red = new ArrayList<>();

		// 2: Code
		Predicate<Fruit> pred = (fruit) -> "Apple".equals(fruit.getName());
		apple = extractFruitList(origin, pred);
		pred = (fruit) -> "Red".equals(fruit.getColor());
		red = extractFruitList(origin, pred);

		// 3: print
		System.out.println("Apple : ");
		for (Fruit fruit : apple) {
			System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
		}
		System.out.println("Red : ");
		for (Fruit fruit : red) {
			System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
		}
	}

	static List<Fruit> extractFruitList(List<Fruit> fruits, Predicate<Fruit> predicate) {
		List<Fruit> resultList = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (predicate.test(fruit)) {
				resultList.add(fruit);
			}
		}
		return resultList;
	}
}
