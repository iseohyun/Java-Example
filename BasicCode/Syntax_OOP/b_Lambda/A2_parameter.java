package b_Lambda;

public class A2_parameter {
  interface A {
    abstract void print(int x);
  }

  public static void main(String[] args) {
    //A a = (int x) -> System.out.println(x);
    A a = x -> System.out.println(x);
    a.print(1);
  }
}