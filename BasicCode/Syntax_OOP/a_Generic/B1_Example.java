package a_Generic;

import java.util.ArrayList;

class Human {
	static int id = 1;
	int my;

	Human() {
		my = id++;
	}

	String name = "nobody";
}

class Man extends Human {
	Man() {
		name = "Adam";
	}
}

class Woman extends Human {
	Woman() {
		name = "Hawa";
	}
}

class Group<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T animal) {
		list.add(animal);
	}

	T get(int index) {
		return list.get(index);
	}

	boolean remove(T animal) {
		return list.remove(animal);
	}

	int size() {
		return list.size();
	}
}

public class B1_Example {
	public static void main(String[] args) {
		Group<Human> hg = new Group<Human>();

		hg.add(new Human());
		hg.add(new Man());
		hg.add(new Woman());
		hg.add(new Man());
		hg.add(new Woman());

		for (int i = 0; i < hg.size(); i++) {
			System.out.println(i + " : " + hg.get(i).name + "_" + hg.get(i).my);
		}

		System.out.println("--------------------");

		hg.remove(hg.get(1));

		for (int i = 0; i < hg.size(); i++) {
			System.out.println(i + " : " + hg.get(i).name + "_" + hg.get(i).my);
		}
	}
}