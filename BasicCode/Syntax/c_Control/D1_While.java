package c_Control;

/**
 * 
 * while 문법:
 * 		while(조건, 거짓이 될때까지 반복){
 * 			바디;
 *      }
 *
 */

public class D1_While {
  public static void main(String[] args) {
    int i = 5;

    while (--i > 0) {
      System.out.println("while : " + i);
    }
  }
}

// 실습과제 1: 7번 실행되도록 i를 수정하세요.
// 실습과제 2: 0번 실행되도록 i를 수정하세요.
// 실습과제 3: 증가하면서 출력되도록 수정하세요.
// 실습과제 4: 2부터 시작해서 20까지 짝수만 출력되도록 수정하세요.
// 실습과제 5(고난도): 1부터 100까지 7의 배수만 출력되도록 수정해보세요.