package c_Control;

import tools.Input;

public class B3_ElseIF {
	public static void main(String[] args) {
		int a = Input.getInt();
		if (a == 1) {
			System.out.println("�ϳ� �Դϴ�!");
		} else if (a == 2) {
			System.out.println("�� �Դϴ�!");
		} else {
			System.out.println("�� �� �����ϴ�.");
		}
	}
}

// �ǽ����� 1: �� �ڵ忡��, 3�� �Է��ϸ� "�� �Դϴ�!"�� ��µǵ��� �ڵ带 �߰� �� ���ϴ�.
// �ǽ����� 2(������): ������ �����ϰ� �Ʒ��� ���� ������ ��� �ǵ��� �����غ��ϴ�.
//		1 �Է½� : 5���� ������, Ȧ�� �Դϴ�.
//		2 �Է½� : 5���� ������, ¦�� �Դϴ�.
//		3 �Է½� : 5���� ������, Ȧ�� �Դϴ�.
//		5 �Է½� : 5�Դϴ�. Ȧ�� �Դϴ�.
//		6 �Է½� : 5���� ũ��, ¦�� �Դϴ�.
//		7 �Է½� : 5���� ũ��, Ȧ�� �Դϴ�.