package C_CtrlStatement;

public class D_While {
	public static void main(String[] args) {
		int i = 10;

		while (--i > 0) {
			System.out.println("while : " + i);
		}

		i = 10;
		do {
			System.out.println("do while: " + i);
		} while (--i > 0);

		for (int j = 0; j < 10; j++) {
			System.out.println("for: " + j);
		}
	}
}
