package A_BasicSyntax;

/**
 *
 * 	심화과정입니다. 이해가 되지 않는다면 넘어가셔도 상관없습니다.
 *	소수는 "부호 + 지수 + 소수"로 이루어져 있습니다.
 *
 */

public class F2_Float2 {
	public static void main(String[] args) {
		float num, sub;
		int repeat = 16;
		num = 1;	// 초기값을 의미합니다.

		// 지수만 변경하는 예제
		for (int i = 0; i < repeat; i++) {
			System.out.print("[" + i + "] " + num + " \t= ");
			printBits(Float.floatToIntBits(num));
			num *= 2;	// 변경규칙입니다. x2
		}

		// 소수만 변경하는 예제
		System.out.println();
		num = 2;	// 초기값을 의미합니다.
		sub = num / 2;
		for (int i = 0; i < repeat; i++) {
			System.out.print("[" + i + "] " + (num) + " \t= ");
			printBits(Float.floatToIntBits(num));
			num += sub;
			sub /= 2;	// 변경규칙입니다. ÷2
		}
	}

	static void printBits(int num) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((num >> i) % 2 == 0) ? 0 : 1);
			if (i % 4 == 0)
				System.out.print(" ");
			if (i == 31)
				System.out.print("[");
			if (i == 23)
				System.out.print("]");
		}
		System.out.println();
	}
}

// 실습과제 : 초기값을 2 부터 출력을 시작하여 계속해서 "-2로 나누어"(변경규칙)봅니다.