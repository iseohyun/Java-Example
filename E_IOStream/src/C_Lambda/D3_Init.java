package C_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class D3_Init {
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
		
		List<Fruit> apple = extractFruitList(origin, new Predicate<Fruit>() {
			@Override
			public boolean test(Fruit fruit) {
				return "Apple".equals(fruit.getName());
			}
		});
		
		List<Fruit> red = extractFruitList(origin, new Predicate<Fruit>() {
			@Override
			public boolean test(Fruit fruit) {
				return "Red".equals(fruit.getColor());
			}
		});		
		
		// 3 : print
		System.out.println("Apple : ");
		for(Fruit fruit : apple) {
			System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
		}
		System.out.println("Red : ");
		for(Fruit fruit : red) {
			System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
		}
	}
	
	static List<Fruit> extractFruitList(List<Fruit> fruits, Predicate<Fruit> predicate){
		List<Fruit> resultList = new ArrayList<>();
		for(Fruit fruit : fruits){
			if(predicate.test(fruit)){
				resultList.add(fruit);
			}
		}
		return resultList;
	}
}
