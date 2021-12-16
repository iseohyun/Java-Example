package f_Function;

/**
 * 
 * �Լ��� �������� ���ڸ� ���� �� �� �ֽ��ϴ�.
 * �߿��� ���� �������� ���� �ƴմϴ�. �����ϴ� ������ ���缭 ������ �˴ϴ�.
 *
 */

public class B2_Arguments {
	public static void main(String[] args) {
		func1(1);
		func3(1, 2, 3);
		func2(1, 2);
	}

	static void func1(int input) {
		System.out.println("��� : " + input);
	}

	static void func2(int input, int input2) {
		System.out.println("��� : " + input + input2);
	}

	static void func3(int input, int input2, int input3) {
		System.out.println("��� : " + input + input2 + input3);
	}
}

// �ǽ����� : ���ڸ� 4�� �޴� �Լ��� ����� ���ϴ�. �Լ��� ����� 4���� ���ڸ� ��� ���ؼ� ����ϴ� ���Դϴ�.
// �ǽ����� 2: ���ڸ� 4�� �޴� �Լ��� �����ϴ�. ���ڴ� int a, int x, int b, int y�Դϴ�.
// 		�Լ��� 4�� �߿� ���� ū ���� ����մϴ�. ������� :
//		newFunc(1, 2, 3, 4)�� "��� : 4"�� ����մϴ�.
//		newFunc(4, 5, 5, 4)�� "��� : 5"�� ����մϴ�.