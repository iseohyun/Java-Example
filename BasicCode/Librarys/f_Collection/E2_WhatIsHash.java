package f_Collection;

import java.util.HashSet;

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
        if (obj instanceof Animal) {
            Animal temp = (Animal) obj;
            return species.equals(temp.species) && habitat.equals(temp.habitat);
        } else {
            return false;
        }
    }
}

public class E2_WhatIsHash {
    public static void main(String[] args) {
        HashSet<Animal> hs = new HashSet<Animal>();
        hs.add(new Animal("고양이", "육지"));
        hs.add(new Animal("고양이", "육지"));
        hs.add(new Animal("고양이", "육지"));
        hs.add(new Animal("고양이", "바다"));
        hs.add(new Animal("강아지", "육지"));

        hs.forEach(e -> System.out.println(e.species + " / " + e.habitat));
    }
}