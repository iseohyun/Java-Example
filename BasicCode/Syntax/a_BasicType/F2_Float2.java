package a_BasicType;

/**
 *	��ȭ�н� :
 * 	
 *		�Ҽ��� "��ȣ + ���� + �Ҽ�"�� �̷���� �ֽ��ϴ�.
 *		����� �� �ڿ� �м��غ��ϴ�.
 *
 *		�ɼ��� 0~5�� �����غ��鼭 �ǽ��غ��ϴ�.
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
			// ������
			printFloats(1, 2, repeat, 0);
			break;
		case 2:
			// �����ϴ� ����
			printFloats(1, 0.5, repeat, 0);
			break;
		case 3:
			// �Ҽ��� ���� ���� + ����
			printFloats(1, 2, repeat, 1);
			break;
		case 4:
			// �Ҽ��� ���� ���� + ����
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