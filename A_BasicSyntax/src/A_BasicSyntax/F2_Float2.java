package A_BasicSyntax;

/**
 * 
 * @author Seohyun Jung
 *
 *	�Ҽ��� "��ȣ + ���� + �Ҽ�"�� �̷���� �ֽ��ϴ�.
 *
 */

public class F2_Float2 {
	public static void main(String[] args) {
		float num, sub;
		int repeat = 16;
		num = 1;

		// ������ �����ϴ� ����
		for (int i = 0; i < repeat; i++) {
			System.out.print("[" + i + "] " + num + " \t= ");
			printBits(Float.floatToIntBits(num));
			num *= 2;
		}

		// �Ҽ��� �����ϴ� ����
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
