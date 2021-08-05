package B_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit{
	private String name;
	private String color;
	
	Fruit(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	String getName(){
		return this.name;
	}
	
	String getColor(){
		return this.color;
	}
}

public class D_FruitExample {
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
		apple = extractApple(origin);
		red = extractRed(origin);
		
		// 3: Print
		System.out.println("Apple : ");
		for(Fruit fruit : apple) {
			System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
		}
		
		System.out.println("Red : ");
		for(Fruit fruit : red) {
			System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
		}
	}
	
	static List<Fruit> extractApple(List<Fruit> fruits){
		List<Fruit> resultList = new ArrayList<>();
		for(Fruit fruit : fruits){
			if("Apple".equals(fruit.getName())){
			resultList.add(fruit);
		}
	}

	return resultList;
	}

	static List<Fruit> extractRed(List<Fruit> fruits){
		List<Fruit> resultList = new ArrayList<>();
		for(Fruit fruit : fruits){
			if("Red".equals(fruit.getColor())){
				resultList.add(fruit);
			}
		}
	    return resultList;
	}
}
