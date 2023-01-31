package b_Extends;

public class G_InstanceOf {
  static class A {
  }

  static class B extends A {
  }

  public static void main(String[] args) {
    A a = new A();
    B b = new B();

    System.out.println("1 : " + (a instanceof A));
    System.out.println("2 : " + (b instanceof A));
    System.out.println("3 : " + (a instanceof B));
    System.out.println("4 : " + (b instanceof B));
  }
}