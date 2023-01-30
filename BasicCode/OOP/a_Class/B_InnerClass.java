package a_Class;

class ClassA {
  class ClassB {
    class ClassC {
    }

    ClassC c = new ClassC();
  }

  ClassB b = new ClassB();
}

public class B_InnerClass {
  public static void main(String[] args) {
    ClassA a = new ClassA();
    System.out.println(a.b.c);
  }
}

// 실습과제 1: B_InnerClass 안에도 클래스 X를 생성하고 호출해 봅니다.
// 실습과제 2: class X안에 Y를 생성하고 호출해봅니다.
