package b_Operation;

import tools.Input;

public class D2_Compare {
	public static void main(String[] args) {
		int num1 = Input.getInt();

		System.out.println("~ ���� : " + ~num1);

		System.out.println("<< ���� : " + (num1 << 2));
		System.out.println("�������\t[" + Integer.toHexString(num1).toUpperCase()+"] "+(num1 >> 2));
		System.out.println(">> ����\t[" + Integer.toHexString(num1 >> 2).toUpperCase()+"] "+(num1 >> 2));
		System.out.println(">>> ����\t[" + Integer.toHexString(num1 >>> 2).toUpperCase()+"] "+(num1 >>> 2));
	}
}

// �ǽ����� : ���(��:8)�� �Է��غ��ϴ�.
// �ǽ����� : ����(��:-8)�� �Է��غ��ϴ�.
// �ǽ����� : shift���� <<2�� x4�� ������ ȿ���� ��Ÿ���� ���� �쿬�ϱ��? x8�� �� �� �ֵ��� �ڵ带 �����غ��ϴ�.