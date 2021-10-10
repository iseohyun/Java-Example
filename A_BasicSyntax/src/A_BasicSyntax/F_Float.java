package A_BasicSyntax;

/**
 * 
 *	 2진법의 표현 방법으로 인해서 10진법과 2진법 사이에 오차가 발생할 수 밖에 없습니다.
 *	아래 예제는 10진법 -> 2진법 -> 10진법으로 변환하는 과정에서 생기는 오류를 보여주고 있습니다.
 *  E2 ~ E3은 심화과정이기 때문에 이해하지 못한다고 해도 괜찮습니다.
 *  
 */

public class F_Float {
	public static void main(String[] args) {
		double num = 0.1;
		for(int i = 0; i < 1000; i++) {
		    num += 0.1;
		}
		System.out.print(num);
	}
}
