package b_Extends;

import test_Answer.C;

/**
 * 
 * 접근제어자
 *
 * private (-) 비공개 : 나만 사용가능 protected (#) 상속에는 public처럼 사용가능 (작성하지 않음) (~) 패키지가
 * 달라지면 접근이 되지 않음(package protected) public (+) 제한 없음
 *
 */

class A {
  private String Pri = "-";
  protected String Pro = "#";
  /* p.p */ String PP = "~";
  public String Pub = "+";

  String direct() {
    return Pri + ", " + Pro + ", " + PP + ", " + Pub;
  }
}

class B extends A {
}

class D extends C {
  public String Pro = super.Pro;
}

public class D_AccessCtrl {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    System.out.print("> 직접 사용 : ");
    System.out.println(a.direct());

    System.out.print("> 상속하여 사용 : ");
    System.out.print(b.Pro + ", ");
    System.out.print(b.PP + ", ");
    System.out.println(b.Pub);

    System.out.print("> 패키지가 다른 상속하여 사용 : ");
    System.out.print(d.Pro + ", "); // 주의 : 패키지 않에서만 사용가능
    System.out.println(d.Pub);

    System.out.print("> 패키지가 다른 상속받지 않은 사용 : ");
    System.out.print(c.Pub + ", ");

  }
}