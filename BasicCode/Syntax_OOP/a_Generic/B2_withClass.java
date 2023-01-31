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

public class B2_withClass {
  public static void main(String[] args) {
    Group<Human> h_group = new Group<Human>();

    h_group.add(new Human());
    h_group.add(new Man());
    h_group.add(new Woman());
    h_group.add(new Man());
    h_group.add(new Woman());

    for (int i = 0; i < h_group.size(); i++) {
      System.out.println(i + " : " + h_group.get(i).name + "_" + h_group.get(i).my);
    }

    System.out.println("--------------------");

    h_group.remove(h_group.get(1));

    for (int i = 0; i < h_group.size(); i++) {
      System.out.println(i + " : " + h_group.get(i).name + "_" + h_group.get(i).my);
    }
  }
}