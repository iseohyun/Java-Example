package b_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C2_new {
    interface X {
        boolean extract(Fruit f);
    }

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
        List<Fruit> apple = extract(origin, (f) -> (f.getName() == "Apple"));
        List<Fruit> red = extract(origin, (f) -> (f.getColor() == "Red"));

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

    static List<Fruit> extract(List<Fruit> fruits, X x) {
        List<Fruit> resultList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (x.extract(fruit)) {
                resultList.add(fruit);
            }
        }
        return resultList;
    }
}
