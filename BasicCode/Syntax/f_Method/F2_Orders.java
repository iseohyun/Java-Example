package f_Method;

/**
 * 
 * 인자의 갯수도 중요하지만 인자의 타입, 그리고 순서까지 함수를 구분하는 기준이 됩니다.
 * 아래 호출된 3개의 printf함수는 모두 다른 3개의 함수입니다.
 *
 */

public class F2_Orders {
	public static void main(String[] args) {
		int i = 1;
		float f = 2.1f;

		printf(i, i);
		printf(i, f);
		printf(f, i);
	}

	static void printf(int input, int input2) {
		System.out.println("Int :" + input + " , Int2 :" + input2);
	}

	static void printf(int input, float input2) {
		System.out.println("Int :" + input + " , Float :" + input2);
	}

	static void printf(float input, int input2) {
		System.out.println("Float :" + input + " , Int :" + input2);
	}
}