package c_Control;

import tools.Input;

public class B2_Else {
	public static void main(String[] args) {
		int a = Input.getInt();
		if (a > 5) {
			System.out.println("���ƿ�.");
		} else {
			System.out.println("�Ⱦ��.");
		}
	}
}

// �ǽ����� 1: "�Ⱦ��." �� ��µǴ� ������ �����Դϱ�?
// �ǽ����� 2: 9�� �ԷµǸ� "�Ⱦ��." �� ��µǵ��� �����غ��ʽÿ�.
// �ǽ����� 3: 1 <= x < 10 �̸� "�Ⱦ��."�� ��µǵ��� �����غ��ʽÿ�.