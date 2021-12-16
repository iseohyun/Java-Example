package A_Generic;

class LandAnimal {
	int repeat = 1;
	String voice = "¾Ç!";

	public void crying() {
		for (int i = 0; i < repeat; i++) {
			System.out.print(voice);
		}
		System.out.println();
	}
}

class Cat extends LandAnimal {
	Cat() {
		voice = "³É!";
	}
}

class Dog extends LandAnimal {
	Dog() {
		voice = "¸Û!";
	}
}

class Sparrow {
	int repeat = 1;
	String voice = "Â±!";

	public void crying() {
		for (int i = 0; i < repeat; i++) {
			System.out.print("Â±!");
		}
		System.out.println();
	}
}

public class B_NoGeneric {
	public static void main(String[] args) {
		LandAnimal la = new LandAnimal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Sparrow sp = new Sparrow();

		la.repeat = 1;
		cat.repeat = 2;
		dog.repeat = 3;
		sp.repeat = 4;

		la.crying();
		cat.crying();
		dog.crying();
		sp.crying();
	}
}