package f_Method;

import tools.Input;

/**
 * 
 * 전달 인자가 들어간 함수문법 :
 * 		void 함수명(전달타입  전달인수) {
 * 			바디;
 * 		}
 *
 */

public class B_Argument {
	static void func(int argv) {
		System.out.println("변수  : " + argv);
	}

	public static void main(String[] args) {
		func(2);
		func(3);
		
		int num = Input.getInt();
		func(num);
	}
}

// 실습과제 : myFunc함수를 만듭니다. myFunc함수를 숫자를 인자로 받아서 +2를 출력하는 함수입니다.
// 실습과제 2: newFunc함수를 만듭니다. newFunc함수는 문자열(String)을 입력받아서 문자열의 길이를 출력하는 함수입니다.