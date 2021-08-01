package Generic;
import java.util.*;

class AnimalListAns<T> {
    ArrayList<T> al = new ArrayList<T>();
    void add(T animal) {
    	al.add(animal);
    }

    void add(T animal, int i) {
    	al.add(i, animal);
    }
    
    boolean remove(T animal) {
    	return al.remove(animal);
    }
    
    T get(int index) {
    	return al.get(index);
    }
    
    int size() {
    	return al.size();
    }
}

public class D1_Answer {
    public static void main(String[] args) {
        AnimalListAns<LandAnimal> al = new AnimalListAns<LandAnimal>(); // new AnimalList<>(); or new AnimalList();

        al.add(new LandAnimal());
        al.add(new Cat());
        al.add(new Dog());

        for (int i = 0; i < al.size(); i++) {
        	al.get(i).repeat = i + 1;
            al.get(i).crying();
        }
        
        System.out.println("--------------------");

        al.add(new Duck(), 1);
        al.get(1).repeat = 3;
        for (int i = 0; i < al.size(); i++) {
            al.get(i).crying();
        }
    }
}