package f_Function;

/**
 * 
 * 함수에 여러개의 인자를 전달 할 수 있습니다.
 * 중요한 것은 전달인자 명이 아닙니다. 전달하는 순서에 맞춰서 대입이 됩니다.
 *
 */

public class B2_Arguments {
	public static void main(String[] args) {
		func1(1);
		func3(1, 2, 3);
		func2(1, 2);
	}

	static void func1(int input) {
		System.out.println("출력 : " + input);
	}

	static void func2(int input, int input2) {
		System.out.println("출력 : " + input + input2);
	}

	static void func3(int input, int input2, int input3) {
		System.out.println("출력 : " + input + input2 + input3);
	}
}

// 실습과제 : 인자를 4개 받는 함수를 만들어 봅니다. 함수의 기능은 4개의 인자를 모두 더해서 출력하는 것입니다.
// 실습과제 2: 인자를 4개 받는 함수를 만들어봅니다. 인자는 int a, int x, int b, int y입니다.
// 		함수는 4개 중에 가장 큰 수를 출력합니다. 예를들어 :
//		newFunc(1, 2, 3, 4)는 "출력 : 4"를 출력합니다.
//		newFunc(4, 5, 5, 4)는 "출력 : 5"를 출력합니다.