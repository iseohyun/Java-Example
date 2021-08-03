package A_Generic;
import java.util.*;

class Duck extends LandAnimal {
	Duck(){
		voice = "²Ð!";
	}
}
class AnimalListQz<T> {
    ArrayList<T> al = new ArrayList<T>();
    void add(T animal) {
    	al.add(animal);
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

public class D_Quiz {
    public static void main(String[] args) {
        AnimalListQz<LandAnimal> al = new AnimalListQz<LandAnimal>(); // new AnimalList<>(); or new AnimalList();

        al.add(new LandAnimal());
        al.add(new Cat());
        al.add(new Dog());

        for (int i = 0; i < al.size(); i++) {
        	al.get(i).repeat = i + 1;
            al.get(i).crying();
        }
        
        System.out.println("--------------------");

        // Quiz. ¾Æ·¡ ÄÚµå°¡ µ¿ÀÛÇÏ¿©, ´ÙÀ½°ú °°Àº Ãâ·ÂÀÌ °¡´ÉÇÏµµ·Ï Á¦³×¸¯À» ¼öÁ¤ÇÏ¼¼¿ä.(overloading)
        //--------------------
        //¾Ç!
        //²Ð!²Ð!²Ð!
        //³É!³É!
        //¸Û!¸Û!¸Û!
//        al.add(new Duck(), 1);
        al.get(1).repeat = 3;
        for (int i = 0; i < al.size(); i++) {
            al.get(i).crying();
        }
    }
}