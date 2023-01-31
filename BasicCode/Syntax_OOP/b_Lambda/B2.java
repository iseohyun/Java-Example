package b_Lambda;

// Method_Reference

public class B2 {
  interface A {
    abstract void print(int x);
  }

  static void func(int x) {
    System.out.println("A_" + x);
  }

  public static void main(String[] args) {
    A a = B2::func;
    a.print(777);
  }
}