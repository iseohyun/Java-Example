package f_Method;

import tools.Input;

/**
 * 
 * ������ �� ������ ���� �ʿ䰡 �����ϴ�.
 * 
 * "�Լ�A�� ��� -> �Լ�B�� �Է�"�ΰ��
 * �Լ�B(�Լ�A());�� ���� �� �� �ֽ��ϴ�.
 *
 */

public class C1_ToValue {
	public static void main(String[] args) {

		int ret, input;
		input = Input.getInt();

		System.out.println("1. �Է� : " + input);

		// ���� ���
		ret = func1(input);
		System.out.println("2. ���� ��� ��� : " + ret);

		// ������ �ʿ䰡 ���ٸ�?
		System.out.println("3. �ٷ� ��� : " + func1(input));

		// ������ ������ ����� ������ �Է����� ����ϴ� ��쵵 �����մϴ�.
		ret = func1(func1(input));
		System.out.println("4. ���Լ�(���Լ�()) : " + ret);
	}

	static int func1(int input) {
		return input + 1;
	}
}

// �ǽ����� : func1( func1 (func1 (func1 (input))))�� � ���� ����� �ɱ��?