package Tarot;

import java.util.Random;

/**
 * 
 * @author Seohyun Jung
 *
 *         타로카드 예제 :
 *
 */
public class Client {
  public static void main(String[] args) {
    Random r = new Random();
    Tarot myTarot = SetBySeed(r.nextInt());

    for (Time t : Time.values()) {
      switch (t) {
        case Past:
          System.out.println("\n= 과거 ================");
          break;
        case Current:
          System.out.println("\n= 현재 ================");
          break;
        case Future:
          System.out.println("\n= 미래 ================");
          break;
      }
      System.out.print(myTarot.getString(t, InfoType.Name));

      if (myTarot.getCard(t).dir) {
        System.out.print("(정위치) ");
      } else {
        System.out.print("(역위치) ");
      }

      System.out.println(myTarot.getString(t, InfoType.Represent));
      System.out.println(myTarot.getString(t, InfoType.Image));

      System.out.print("애정운 : ");
      System.out.println(myTarot.getString(t, InfoType.Love));
    }
  }

  static Tarot SetBySeed(int Seed) {
    int a1, a2, a3;
    boolean b1, b2, b3;

    if (Seed < 0)
      Seed *= -1;

    System.out.printf("Seed : %08X", Seed);

    a1 = Seed % 22;
    Seed -= a1;
    Seed /= 22;
    a2 = Seed % 21;
    Seed -= a2;
    Seed /= 21;
    a3 = Seed % 20;
    Seed -= a3;
    Seed /= 20;
    b1 = (Seed % 2 == 0) ? false : true;
    Seed >>= 1;
    b2 = (Seed % 2 == 0) ? false : true;
    Seed >>= 1;
    b3 = (Seed % 2 == 0) ? false : true;

    Tarot t = new Tarot(a1, b1, a2, b2, a3, b3);
    return t;
  }
}
