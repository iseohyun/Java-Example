package A_Collection;

import java.util.HashSet;
import java.util.Iterator;

class Animal {
	String species;
	String habitat;
	Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}
	public int hashCode() {
		return (species + habitat).hashCode();
	}
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal temp = (Animal)obj;
			return species.equals(temp.species) && habitat.equals(temp.habitat);
		} else {
			return false;
		}
	}
	public void show() {
		System.out.println(species + " / " + habitat);
	}
}

public class E2_WhatIsHash {
	public static void main(String[] args) {
		HashSet<Animal> hs = new HashSet<Animal>();
		hs.add(new Animal("�����", "����"));
		hs.add(new Animal("�����", "����"));
		hs.add(new Animal("�����", "����"));
		hs.add(new Animal("�����", "�ٴ�"));
		hs.add(new Animal("������", "����"));

		Iterator<Animal> iter = hs.iterator();
		while(iter.hasNext()) {
			iter.next().show();
		}
	}
}
