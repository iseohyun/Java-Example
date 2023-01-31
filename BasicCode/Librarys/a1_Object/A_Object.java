package a1_Object;

public class A_Object {
  static class Class1 {
  }

  public static void main(String[] args) {
    Class1 c1 = new Class1();
    
    System.out.println(c1);
    System.out.println(c1.toString());

    System.out.println(c1.hashCode());
    System.out.println(Integer.toHexString(c1.hashCode()));
  }
}
