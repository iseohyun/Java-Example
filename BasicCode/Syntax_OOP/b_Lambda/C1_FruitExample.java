package b_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit {
    private String name;
    private String color;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }
}

public class C1_FruitExample {
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
        apple = extractName(origin, "Apple");
        red = extractColor(origin, "Red");

        // 3: Print
        System.out.println("Apple : ");
        for (Fruit fruit : apple) {
            System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
        }

        System.out.println("Red : ");
        for (Fruit fruit : red) {
            System.out.println("\t" + fruit.getName() + "/" + fruit.getColor());
        }
    }

    static List<Fruit> extractName(List<Fruit> fruits, String fruitType) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName() == fruitType) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    static List<Fruit> extractColor(List<Fruit> fruits, String color) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor() == color) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }
}