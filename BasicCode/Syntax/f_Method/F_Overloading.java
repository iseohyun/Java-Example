package f_Method;

/**
 * 
 * �Լ��� �����ε�(overloading)�� �Լ��� �����ϴµ� ���� �߿��� �����Դϴ�.
 * ��ǻ�ʹ� �Լ��� ������ ��, ���ڷ� �ν������ʰ� ���ڷ� �ν��մϴ�.
 * ��, �츮�� �Լ��̸��� ��� �ۼ��ϵ� ���ڷ� �����ؼ� �����Ѵٴ� ���Դϴ�.
 * �׷���, ���ڷ� �����ϴ� ��Ģ���� ������ ������ ������ ������ �ݴϴ�.
 * 
 * ��, int A(int a)�� int A(char a)�� ���� �ٸ� �Լ��� �ν��Ѵٴ� ��������.
 * ����, int A(int a)�� int A(int a, int b)�� ���� �ٸ� �Լ��� �ν��մϴ�.
 * 
 * ������ �츮�� �Ȱ��� A�Լ��� �ν��ϱ� ������, �� ���� �̿��Ͽ� �������� ������½�ŵ�ϴ�.
 * �츮�� ����� �� �ִ� �Լ��� �Ѱ谡 �ֽ��ϴ�. �׷��� ���ڸ� �ٸ��� ����� ����� �ϴ� �Լ��� �� ���� �̸����� �ۼ��ϸ�,
 * ���� ���ϰ� �Լ����� ������ �� �ֽ��ϴ�.
 *
 */

public class F_Overloading {
	public static void main(String[] args) {
		int i = 1;
		float f = 2.1f;
		char c = 'a';
		double d = 4.1;

		printf(i);
		printf(f);
		printf(d);
		printf(c);

	}

	static void printf(int input) {
		System.out.println("Int :" + input);
	}

	static void printf(float input) {
		System.out.println("Float :" + input);
	}

	static void printf(double input) {
		System.out.println("Double :" + input);
	}

	static void printf(char input) {
		System.out.println("Char :" + input);
	}
}