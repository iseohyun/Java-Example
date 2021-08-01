package C_CtrlStatement;

public class D1_Quiz {
	public static void main(String[] args) {
		int i = 10;

		// Quiz 1 : 아래 제어문의 조건"(--i > 0)"을 수정하여 11 부터 15까지 출력되도록 하세요.
		while (--i > 0) {
			System.out.println("while : " + i);
		}

		// Quiz 2 : 아래 제어문의 조건"(--i > 0)"을 수정하여 10 부터 0까지 짝수만 출력되도록 하세요.
		i = 10;
		do {
			System.out.println("do while: " + i);
		} while (--i > 0);

		// Quiz 3 : 아래 제어문을 수정하여 11부터 5까지 감소하면서 출력되도록 바꾸세요.
		for (int j = 0; j < 10; j++) {
			System.out.println("for: " + j);
		}
	}
}
