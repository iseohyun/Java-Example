package f_Method;

import tools.Input;

/**
 * 
 * 리턴을 꼭 변수에 받을 필요가 없습니다.
 * 
 * "함수A의 출력 -> 함수B의 입력"인경우
 * 함수B(함수A());와 같이 쓸 수 있습니다.
 *
 */

public class C1_ToValue {
	public static void main(String[] args) {

		int ret, input;
		input = Input.getInt();

		System.out.println("1. 입력 : " + input);

		// 기존 방법
		ret = func1(input);
		System.out.println("2. 기존 방법 출력 : " + ret);

		// 저장할 필요가 없다면?
		System.out.println("3. 바로 출력 : " + func1(input));

		// 심지어 본인의 출력을 본인의 입력으로 사용하는 경우도 가능합니다.
		ret = func1(func1(input));
		System.out.println("4. 내함수(내함수()) : " + ret);
	}

	static int func1(int input) {
		return input + 1;
	}
}

// 실습과제 : func1( func1 (func1 (func1 (input))))은 어떤 수가 출력이 될까요?