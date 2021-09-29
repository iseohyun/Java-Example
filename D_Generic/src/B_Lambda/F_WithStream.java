package B_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Dog {
	private String name;
	private String species;

	public Dog(String name) {
		this.name = name;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String toString() {
		return "Dog{" + "name='" + name + '\'' + ", species='" + species + '\'' + '}';
	}
}

public class F_WithStream {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("±è°©¼ø", "±è°©µ¹");
		List<Dog> dogs1 = names.stream().map(x -> new Dog(x)).collect(Collectors.toList());
		List<Dog> dogs2 = names.stream().map(Dog::new).collect(Collectors.toList());
		dogs2.forEach(x -> x.setSpecies("ÀÌÅ»¸®¾È ±×·¹ÀÌ ÇÏ¿îµå"));
		System.out.println(dogs1);
		System.out.println(dogs2);
	}
}