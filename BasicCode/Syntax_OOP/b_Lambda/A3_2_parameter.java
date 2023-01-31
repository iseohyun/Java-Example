package b_Lambda;

public class A3_2_parameter {
  interface A {
    abstract void print(int x, int y);
  }

  public static void main(String[] args) {
    A a = (x, y) -> System.out.println(x + y);
    a.print(2, 3);
  }
}