package b_Lambda;

// Method_Reference

public class B3 {
  interface A {
    abstract void print(int x, int y);
  }

  static void func(int x, int y) {
    System.out.println("A_" + (x + y));
  }

  public static void main(String[] args) {
    A a = B3::func;
    a.print(777, 222);
  }
}