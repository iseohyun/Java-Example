package a_Generic;

public class B1_inClass {
  static class A {
    String name;

    A(String name) {
      this.name = name;
    }
  }

  static class B extends A {
    B(String name) {
      super(name);
    }
  }

  static class C extends A {
    C(String name) {
      super(name);
    }
  }

  static class Gen<T> {
    void print(T t) {
      System.out.println("Name : " + ((A) t).name);
    }
  }

  public static void main(String[] args) {
    Gen<A> g = new Gen<A>();
    g.print(new B("Jack"));
    g.print(new C("John"));
  }
}