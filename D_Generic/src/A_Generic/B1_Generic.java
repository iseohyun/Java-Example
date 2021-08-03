package A_Generic;
import java.util.*;

class AnimalList<T> {
    ArrayList<T> al = new ArrayList<T>();
    void add(T animal) {
    	al.add(animal);
    }

    T get(int index) {
    	return al.get(index);
    }

    boolean remove(T animal) {
    	return al.remove(animal);
    }

    int size() {
    	return al.size();
    }
}

public class B1_Generic {
    public static void main(String[] args) {
        AnimalList<LandAnimal> al = new AnimalList<LandAnimal>(); // new AnimalList<>(); or new AnimalList();

        al.add(new LandAnimal());
        al.add(new Cat());
        al.add(new Dog());
        al.add(new Cat());
        al.add(new Dog());

        for (int i = 0; i < al.size(); i++) {
        	al.get(i).repeat = i + 1;
            al.get(i).crying();
        }
        
        System.out.println("--------------------");
        
        al.remove(al.get(1));
        
        for (int i = 0; i < al.size(); i++) {
            al.get(i).crying();
        }
    }
}