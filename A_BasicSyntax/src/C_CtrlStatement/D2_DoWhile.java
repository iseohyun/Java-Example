package C_CtrlStatement;

/**
 * 
 * do ~ while 문법:
 * 		do{
 * 			바디;
 *      }while(조건, 거짓이 될때까지 반복);
 *
 *	while과 do~while의 차이점은 최소 1번 수행하느냐의 차이입니다.
 *
 */

public class D2_DoWhile {
	public static void main(String[] args) {
		int i = 5;

		do {
			System.out.println("do while: " + i);
		} while (--i > 0);
	}
}

//실습과제 1: 7번 실행되도록 i를 수정하세요.
//실습과제 2: 0번 실행되도록 i를 수정할 수 있나요?
//실습과제 3: 증가하면서 출력되도록 수정하세요.
//실습과제 4: 2부터 시작해서 20까지 짝수만 출력되도록 수정하세요.
//실습과제 5(고난도): 1부터 100까지 7의 배수만 출력되도록 수정해보세요.