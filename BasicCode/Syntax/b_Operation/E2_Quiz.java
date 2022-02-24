package b_Operation;

public class E2_Quiz {
	public static void main(String[] args) {
		int a = 64, r = 0;

		// 실습과제 1: shift(<<, >>)연산을 통해서, 8을 출력하세요.
		// r = a >> ?;
		r = a >> 3;

		System.out.println("1. 연산 결과 : " + r);

		// 실습과제 2: shift(<<, >>)연산을 통해서, 256을 출력하세요.
		// r = a << ?;
		System.out.println("2. 연산 결과 : " + r);

		r = 0x000FFFAA;
		// 실습과제 3: 0->1, 1->0으로 바꾸어서 출력하세요. (정답 : FFF00055)
		// r = ?;
		System.out.println("3. 연산 결과 : " + Integer.toHexString(r).toUpperCase());
	}
}
