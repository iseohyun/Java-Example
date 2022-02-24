package b_Operation;

public class D2_Compare {
	public static void main(String[] args) {
		int num1 = -100;

		System.out.println("�������\t[" + toBin(num1) + "] " + num1);
		System.out.println("~ ���� \t[" + toBin(~num1) + "] " + ~num1);
		System.out.println("<< ����\t[" + toBin(num1 << 2) + "]" + (num1 << 2));
		System.out.println(">> ����\t[" + toBin(num1 >> 2) + "] " + (num1 >> 2));
		System.out.println(">>> ����\t[" + toBin(num1 >>> 2) + "] " + (num1 >>> 2));
	}

	static String toBin(int num) {
		String str = "";
		for (int i = 0; i < 32; i++) {
			str = ((num % 2 == 0) ? "0" : "1") + str;
			num >>= 1;
		}
		return str;
	}
}

// �ǽ����� : ���(��:8)�� �Է��غ��ϴ�.
// �ǽ����� : ����(��:-8)�� �Է��غ��ϴ�.
// �ǽ����� : shift���� <<2�� x4�� ������ ȿ���� ��Ÿ���� ���� �쿬�ϱ��? x8�� �� �� �ֵ��� �ڵ带 �����غ��ϴ�.