package a_BasicType;

/**
 *	심화학습 :
 * 	
 *		소수는 "부호 + 지수 + 소수"로 이루어져 있습니다.
 *		출력을 한 뒤에 분석해봅니다.
 *
 *		옵션을 0~5로 변경해보면서 실습해봅니다.
 */

public class F2_Float2 {
	public static void main(String[] args) {
		int option = 1;
		final int repeat = 16;

		switch (option) {
		case 0:
			printFloats((float) Math.pow(0.5, 149), 2, 32, 0);
			break;
		case 1:
			// 지수부
			printFloats(1, 2, repeat, 0);
			break;
		case 2:
			// 감소하는 예시
			printFloats(1, 0.5, repeat, 0);
			break;
		case 3:
			// 소수부 변경 예시 + 증가
			printFloats(1, 2, repeat, 1);
			break;
		case 4:
			// 소수부 변경 예시 + 감소
			printFloats(1, 0.5, repeat, 1);
			break;
		case 5:
			printFloats(-1, 0.5, repeat, 1);
			break;
		}
	}

	static void printFloats(float num, double scope, int repeat, float base) {

		for (int i = 0; i < repeat; i++) {
			if ((base + num) - (int) (base + num) > 0)
				if ((base + num) < 0.000001)
					System.out.printf("[%2d] " + (base + num) + " \t = ", i);
				else
					System.out.printf("[%2d] %8f \t = ", i, base + num);
			else
				System.out.printf("[%2d] %8d \t = ", i, (int) (base + num));
			printBits(Float.floatToIntBits(base + num));
			num *= scope;
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