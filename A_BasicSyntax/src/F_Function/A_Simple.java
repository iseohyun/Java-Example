package F_Function;

/**
 * 
 * ���� ���ϴ� ��ɸ� �� ��� �ڵ� ����� ����� ������ �Լ��� ����ٰ� �մϴ�.
 * �Լ��� �����θ�, ���� �ʿ��� ������ �ҷ� �� �� �ֽ��ϴ�.
 *
 *	�ʰ��� �Լ� ���� :
 *		void �Լ���() {
 *			�ٵ�;
 *		}
 */

public class A_Simple {
	public static void main(String[] args) {
		func1();
		func2();
		func1();
		func2();
	}

	static void func1() {
		System.out.println("ȣ�� �Ǿ����ϴ�.");
	}

	static void func2() {
		System.out.println("�ι� ° �Լ��Դϴ�.");
	}
}

// �ǽ����� : fucn3�� �����, func3�� ȣ���մϴ�. func3�� "���� ° �Լ��Դϴ�."�� ����մϴ�.
// �ǽ����� 2: fucn4�� �����, func4�� ȣ���մϴ�. func4�� func1�� func2�� ȣ���ϴ� �Լ��Դϴ�.