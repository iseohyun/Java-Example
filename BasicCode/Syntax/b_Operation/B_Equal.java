package b_Operation;

public class B_Equal {
  public static void main(String[] args) {
    int num = 100;
    int res1, res2;

    res1 = res2 = 1;
    res1 = res1 + num; // 대입연산자1
    res2 += num; // 대입연산자2
    System.out.println("1 : " + res1 + " / " + res2);

    res1 = res2 = 10;
    res1 = res1 - num; // 대입연산자1
    res2 -= num; // 대입연산자2
    System.out.println("2 : " + res1 + " / " + res2);

    res1 = res2 = 10;
    res1 = res1 % num; // 대입연산자1
    res2 %= num; // 대입연산자2
    System.out.println("3 : " + res1 + " / " + res2);

    res1 = res2 = 10;
    res1 = res1 << num; // 대입연산자1
    res2 <<= num; // 대입연산자2
    System.out.println("3 : " + res1 + " / " + res2);
  }
}