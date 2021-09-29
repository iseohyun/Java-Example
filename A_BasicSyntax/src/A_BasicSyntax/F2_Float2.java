package A_BasicSyntax;

/**
 * 
 * @author Seohyun Jung
 *
 *	소수는 "부호 + 지수 + 소수"로 이루어져 있습니다.
 *
 */

public class F2_Float2 {
	public static void main(String[] args) {
		float num, sub;
		int repeat = 16;
		num = 1;

		// 지수만 변경하는 예제
		for (int i = 0; i < repeat; i++) {
			System.out.print("[" + i + "] " + num + " \t= ");
			printBits(Float.floatToIntBits(num));
			num *= 2;
		}

		// 소수만 변경하는 예제
		System.out.println();
		num = 2;
		sub = num / 2;
		for (int i = 0; i < repeat; i++) {
			System.out.print("[" + i + "] " + (num) + " \t= ");
			printBits(Float.floatToIntBits(num));
			num += sub;
			sub /= 2;
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
