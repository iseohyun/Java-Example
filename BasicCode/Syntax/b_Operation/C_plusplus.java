package b_Operation;

/**
 *
 *	전위 연산과 후위연산을 이해하기 위한 예제 입니다.
 *
 */

public class C_plusplus {
  public static void main(String[] args) {
    int num = 100;

    System.out.println("1 : " + num++);
    System.out.println("* : " + num);
    System.out.println("2 : " + num++);
    System.out.println("* : " + num);
    System.out.println("3 : " + num++);
    System.out.println("* : " + num);

    System.out.println("4 : " + ++num);
    System.out.println("* : " + num);
    System.out.println("5 : " + ++num);
    System.out.println("* : " + num);
    System.out.println("6 : " + ++num);
    System.out.println("* : " + num);

    System.out.println("7 : " + --num);
    System.out.println("8 : " + --num);
    System.out.println("9 : " + --num);
    System.out.println("0 : " + num--);
    System.out.println("1 : " + num--);
  }
}