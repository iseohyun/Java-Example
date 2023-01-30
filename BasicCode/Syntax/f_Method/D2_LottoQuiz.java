package f_Method;

import java.util.Random;

/**
 * 
 * 이미 로토를 만드는 함수가 만들어져 있습니다.
 * 단, 한번출력하기 위해서는 3개의 함수를 순서대로 호출 해야합니다.
 * 즉 5개의 로토를 출력하기 위해서는 총 15번 호출이 이루어져야 합니다.
 * 
 * 1. 3개를 한번에 호출 할 수 있는 함수를 만들어 보세요.
 * 2. 해당 함수를 5번 호출해보세요.
 * 
 */

public class D2_LottoQuiz {
  static int[] lotto = new int[6];

  public static void main(String[] args) {
    genLotto(); // 로또 번호를 생성한다.
    sort(); // 낮은 번호부터 정렬한다.
    printLotto(); // 로또 번호를 프린터한다.
  }

  // 실습과제 . 로또 번호를 생성해서, 순서대로 정렬 한 후, 프린터하는 함수를 생성한다.
  // 실습과제 2. 해당 함수를 5번 출력한다.

  static void genLotto() {
    Random rand = new Random();

    lotto[0] = rand.nextInt(45) + 1;
    for (int i = 1; i < 6; i++) {
      lotto[i] = rand.nextInt(45) + 1;
      for (int j = 0; j < i; j++) {
        if (lotto[i] == lotto[j]) {
          i--;
          break;
        }
      }
    }
  }

  static void sort() {
    for (int i = 0; i < 6; i++) {
      for (int j = i; j < 6; j++) {
        if (lotto[i] > lotto[j]) {
          lotto[i] ^= lotto[j];
          lotto[j] ^= lotto[i];
          lotto[i] ^= lotto[j];
        }
      }
    }
  }

  static void printLotto() {
    for (int i = 0; i < 6; i++) {
      System.out.print(lotto[i] + " ");
    }
    System.out.println();
  }
}