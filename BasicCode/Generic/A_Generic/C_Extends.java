package A_Generic;

import java.util.ArrayList;

class Chihuahua extends Dog {
	Chihuahua() {
		voice = "¾Æ¸£¸£~";
	}
}

class Retriever extends Dog {
	Retriever() {
		voice = "ÄÈ!";
	}
}

class Jindo extends Dog {
	Jindo() {
		voice = "¿Ð!";
	}
}

class AnimalListWEx<T extends Dog> {
	ArrayList<T> al = new ArrayList<T>();

	void add(T animal) {
		al.add(animal);
	}

	T get(int index) {
		return al.get(index);
	}

	int size() {
		return al.size();
	}
}

public class C_Extends {
	public static void main(String[] args) {
		AnimalListWEx<Dog> alex = new AnimalListWEx<>();

		alex.add(new Dog());
		alex.add(new Chihuahua());
		alex.add(new Retriever());
		alex.add(new Jindo());

		// Can't add this class
		// alex.add(new Duck());

		for (int i = 0; i < alex.size(); i++) {
			alex.get(i).repeat = i + 1;
			alex.get(i).crying();
		}
	}
}