package B_Arithmetic;

import A_BasicSyntax.Input;

public class A1_Bracket {
	public static void main(String[] args) {
		int input = Input.getInt();
		int r = 2 + input * 6;	// ��1
		System.out.println("2 + " + input + " x 6 = " + r);

		r = (2 + input) * 6;	// ��2
		System.out.println("(2 + " + input + ") x 6 = " + r);
	}
}

// �ǽ����� 1: [��1]�� [��2]�� ������ ����� �Է�(input)�� ã�� �� �ֽ��ϱ�? 