package b_Lambda;

// Method_Reference

public class B1_Reference {
  interface A {
    abstract void print();
  }

  static void func() {
    System.out.println("A");
  }

  public static void main(String[] args) {
    A a = B1_Reference::func;
    a.print();
  }
}