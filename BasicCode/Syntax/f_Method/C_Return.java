package f_Method;

import tools.Input;

/**
 * 정보전달 방향에 따라,
 * 
 * 		나 -> 함수 : 인자
 *		함수 -> 나 : 리턴
 *
 *	라고 합니다. 리턴은 여러개를 전달 할 수 없습니다. 단, 1개만 받을 수 있습니다.
 *	문법 :
 *
 *		리턴형 함수명(인자들...){
 *			바디;
 *		}
 *
 * 	리턴형이 없을 때는 void를 합니다.
 * 
 * 	리턴 받는 방법:
 * 		'리턴 받을 변수' = 함수();
 *
 */

public class C_Return {
	public static void main(String[] args) {
		int ret = 0;
		int input = Input.getInt();
		
		ret = func1(input);
		System.out.println("출력 : " + ret); // 리턴 출력
	}

	static int func1(int input) {
		System.out.println("입력 : " + input);
		return input + 1;
	}
}

// 실습과제 : 입력한 숫자의 2배를 리턴하는 함수를 작성해봅니다.
// 실습과제 2(고난도): 입력한 숫자가 소수인지 아닌지 판별하는 함수를 만들어 봅니다. 함수 원형은 아래와 같습니다.
//		String isPrime(int input)
//		"소수입니다."또는 "소수가 아닙니다."가 리턴되어야 합니다.
//		단, 10000을 넘어가면, "숫자가 너무 큽니다."을 리턴합니다.