package C_CtrlStatement;

public class D1_Quiz {
	public static void main(String[] args) {
		int i = 10;

		// Quiz 1 : �Ʒ� ����� ����"(--i > 0)"�� �����Ͽ� 11 ���� 15���� ��µǵ��� �ϼ���.
		while (--i > 0) {
			System.out.println("while : " + i);
		}

		// Quiz 2 : �Ʒ� ����� ����"(--i > 0)"�� �����Ͽ� 10 ���� 0���� ¦���� ��µǵ��� �ϼ���.
		i = 10;
		do {
			System.out.println("do while: " + i);
		} while (--i > 0);

		// Quiz 3 : �Ʒ� ����� �����Ͽ� 11���� 5���� �����ϸ鼭 ��µǵ��� �ٲټ���.
		for (int j = 0; j < 10; j++) {
			System.out.println("for: " + j);
		}
	}
}
