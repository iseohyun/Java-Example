package f_Method;

import tools.Input;

/**
 * 
 * ���� ���ڰ� �� �Լ����� :
 * 		void �Լ���(����Ÿ��  �����μ�) {
 * 			�ٵ�;
 * 		}
 *
 */

public class B_Argument {
	static void func(int argv) {
		System.out.println("����  : " + argv);
	}

	public static void main(String[] args) {
		func(2);
		func(3);
		
		int num = Input.getInt();
		func(num);
	}
}

// �ǽ����� : myFunc�Լ��� ����ϴ�. myFunc�Լ��� ���ڸ� ���ڷ� �޾Ƽ� +2�� ����ϴ� �Լ��Դϴ�.
// �ǽ����� 2: newFunc�Լ��� ����ϴ�. newFunc�Լ��� ���ڿ�(String)�� �Է¹޾Ƽ� ���ڿ��� ���̸� ����ϴ� �Լ��Դϴ�.