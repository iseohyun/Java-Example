package F_Function;

import A_BasicSyntax.Input;

/**
 * 
 * ���� ���ڰ� �� �Լ����� :
 * 		void �Լ���(����Ÿ��  ��������) {
 * 			�ٵ�;
 * 		}
 *
 */

public class B_Factor {
	public static void main(String[] args) {
		int input = Input.getInt();
		func(input);
	}

	static void func(int input) {
		System.out.println("��� : " + input);
	}
}

// �ǽ����� : myFunc�Լ��� ����ϴ�. myFunc�Լ��� ���ڸ� ���ڷ� �޾Ƽ� +2�� ����ϴ� �Լ��Դϴ�.
// �ǽ����� 2: newFunc�Լ��� ����ϴ�. newFunc�Լ��� ���ڿ�(String)�� �Է¹޾Ƽ� ���ڿ��� ���̸� ����ϴ� �Լ��Դϴ�.